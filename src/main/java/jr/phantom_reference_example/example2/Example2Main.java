package jr.phantom_reference_example.example2;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;

public class Example2Main {
    public static void main(String[] args) {
        //специальная очередь для призрачных объектов
        ReferenceQueue<Integer> queue = new ReferenceQueue<Integer>();

        //список призрачных ссылок
        ArrayList<PhantomInteger> list = new ArrayList<PhantomInteger>();

        //создаем 10 объектов и добавляем их в список через призрачные ссылки
        for ( int i = 0; i < 10; i++) {
            list.add(new PhantomInteger (i, queue));
        }

        Thread referenceThread = new Thread()
        {
            public void run()
            {
                while (true)
                {
                    try
                    {
                        //получаем новый объект из очереди, если объекта нет - ждем!
                        PhantomInteger ref = (PhantomInteger)queue.remove();
                        //вызвваем у него метод close
                        ref.close();
                        ref.clear();
                    }
                    catch (Exception ex)
                    {
                        // пишем в лог ошибки
                    }
                }
            }
        };
//запускаем поток в служебном режиме.
        referenceThread.setDaemon(true);
        referenceThread.start();
    }

    static class PhantomInteger extends PhantomReference<Integer>
    {
        PhantomInteger(Integer referent, ReferenceQueue<? super Integer> queue)
        {
            super(referent, queue);
        }

        private void close()
        {
            System.out.println("Bad Integer totally destroyed!");
        }
    }
}
