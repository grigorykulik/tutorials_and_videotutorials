package jr.rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    // уникальное имя удаленного объекта. Должно быть одинаковым на клиенте и сервере.
    public static final String UNIQUE_BINDING_NAME = "server.reverse";

    public static void main(String[] args) throws Exception {
        // создание реестра расшареных объетов
        // получение ссылки на «Реестр удаленных объектов» по порту 2099,
        // т.е. такому же, как и у реестра у серверного приложения.
        final Registry registy = LocateRegistry.getRegistry(2099);

        // получаем объект (на самом деле это proxy-объект)
        // получаем объект у реестра. Полученный объект является
        // proxy-объектом и приводится к типу интерфейса.
        // Интерфейс должен быть унаследован от интерфейса-маркера Remote.
        Reverse service = (Reverse) registy.lookup(UNIQUE_BINDING_NAME);

        // Вызываем удаленный метод
        // вызываем методы интерфейса так, как будто объект
        // был создан в этой же программе. Никакой разницы.
        String result = service.reverse("Home");
    }
}
