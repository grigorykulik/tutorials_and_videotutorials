package baeldung.a_guide_to_nio_2_filevisitor;

import java.io.IOException;
import java.nio.file.*;


public class Main {
    public static void main(String[] args) throws IOException {
        Path startingDir = Paths.get("/home/greg/Desktop/test/testFolder");
        String fileToSearch = "file4.txt";
        FVisitor visitor = new FVisitor(fileToSearch, startingDir);
        Files.walkFileTree(startingDir, visitor);
    }
}
