package jr.random_access_file_examples;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Example1 {
    public static void main(String[] args) throws IOException {
        //r- read, файл открыт только для чтения
        RandomAccessFile raf = new RandomAccessFile("/home/greg/Desktop/test/test1", "r");

        //перемещаем «курсор» на 100-й символ.
        raf.seek(100);

        //читаем строку, начиная с текущего положения курсора и до конца строки
        String text = raf.readLine();

        //закрываем файл
        raf.close();
    }
}
