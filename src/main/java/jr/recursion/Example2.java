package jr.recursion;

import java.io.File;

public class Example2 {
    public static void main(String[] args) {
        printAllFiles(new File("c:/windows/"));
    }

    private static void printAllFiles(File dir) {
        for (File file : dir.listFiles()) {
            if (file.isDirectory()) {
                printAllFiles(file);
            } else {
                System.out.println(file.getAbsoluteFile());
            }
        }
    }
}
