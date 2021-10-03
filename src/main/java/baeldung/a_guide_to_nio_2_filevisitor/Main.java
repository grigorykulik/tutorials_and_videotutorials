package baeldung.a_guide_to_nio_2_filevisitor;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;



public class Main {
    public static void main(String[] args) throws IOException {
        Path startingDir = Paths.get("./");
        FileVisitorImplementation visitor = new FileVisitorImplementation();
        Files.walkFileTree(startingDir, visitor);
    }

    private class FVisitor implements FileVisitor<Path> {

        @Override
        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
            return null;
        }

        @Override
        public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
            return null;
        }

        @Override
        public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
            return null;
        }
    }
}
