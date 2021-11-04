package jr.random_access_file_examples;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Example2 {
    public static void main(String[] args) throws IOException {
        //rw- read/write, файл открыт и для чтения и для записи
        RandomAccessFile raf = new RandomAccessFile("/home/greg/Desktop/test/test1", "rw");

        //пишем в файл строку, начиная с 0-го байта
        raf.writeBytes("It is a string");

        //ставим курсор на 8-й символ
        raf.seek(8);

        //печатаем в файл строку surprise!
        raf.writeBytes("surprise!");

        //закрываем файл
        raf.close();
    }
}
