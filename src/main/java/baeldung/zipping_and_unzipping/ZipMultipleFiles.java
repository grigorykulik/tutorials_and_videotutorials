package baeldung.zipping_and_unzipping;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipMultipleFiles {
    public static void main(String[] args) throws IOException {
        List<String> srcFiles = Arrays.asList("text1.txt", "text2.txt");
        FileOutputStream fos = new FileOutputStream("compressed.zip");
        ZipOutputStream zipOut = new ZipOutputStream(fos);

        for (String s : srcFiles) {
            File fileToZip = new File(s);
            FileInputStream fis = new FileInputStream(fileToZip);
            ZipEntry entry = new ZipEntry(fileToZip.getName());
            zipOut.putNextEntry(entry);

            byte[] bytes = new byte[1024];
            int length;
            while ((length = fis.read(bytes)) >= 0) {
                zipOut.write(bytes, 0, length);
            }
            fis.close();
        }

        zipOut.close();
        fos.close();
    }
}
