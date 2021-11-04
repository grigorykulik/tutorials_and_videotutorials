package baeldung.zipping_and_unzipping;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFile {
    public static void main(String[] args) throws IOException {
        // Объявляем файл, который хотим положить в архив
        String srcFile = "/home/greg/Desktop/test/testFile.txt";

        // Результирующий архив, куда будем писать
        FileOutputStream fos = new FileOutputStream("/home/greg/Desktop/test/compressed.zip");

        // Передаем название архива в ZipOutputStream
        ZipOutputStream zos = new ZipOutputStream(fos);

        // Создаем файл из указанного пути
        File fileToZip = new File(srcFile);

        // Создаем поток, в который будем читать содержимое этого файла
        FileInputStream fis = new FileInputStream(fileToZip);

        // Создаем зип энтри и кладем его в ZipOutputStream zos
        ZipEntry ze = new ZipEntry(fileToZip.getName());
        zos.putNextEntry(ze);

        // Массив, в который будем считывать содержимое файла
        byte[] bytes = new byte[1024];
        int length;

        // Считываем из FileInputStream в bytes 1024 байта. Фактическое число прочитанных байтов
        // присваиваем переменной length.
        // После этого в ZipOutputStream записываем содержимое bytes.
        while ((length = fis.read(bytes)) >= 0) {
            zos.write(bytes, 0, length);
        }

        zos.close();
        fis.close();
        fos.close();
    }
}
