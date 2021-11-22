package jr;

import java.lang.ref.SoftReference;

public class SoftReferenceExample {
    public static void main(String[] args) {
        String s = new String();
        //создание мягкой ссылки на объект
        SoftReference<String> ref = new SoftReference<String>(s);

        //теперь на объект ссылается только мягкая ссылка
        s = null;

        //теперь на объект ссылается еще и обычная переменная
        s = ref.get();

        //очищаем мягкую ссылку
        ref.clear();
    }
}
