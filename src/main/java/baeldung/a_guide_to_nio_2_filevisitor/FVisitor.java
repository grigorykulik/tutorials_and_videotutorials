package baeldung.a_guide_to_nio_2_filevisitor;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class FVisitor implements FileVisitor<Path> {
    private String fileName;
    private Path startDir;

    public FVisitor(String fileName, Path startDir) {
        this.fileName = fileName;
        this.startDir = startDir;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        String filename = file.getFileName().toString();
        if (fileName.equals(filename)) {
            System.out.println("File found: " + filename);
            return FileVisitResult.TERMINATE;
        }
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) {
        System.out.println("Failed to access file: " + file.toString());
        return FileVisitResult.CONTINUE;
    }

    /**
     * We use the Files.isSameFile API to check if the directory that has just been traversed is the directory
     * where we started traversal from. If the return value is true, that means the search is complete and the
     * file has not been found. However, if the return value is false, that means we just finished traversing
     * a subdirectory and there is still a probability of finding the file in some other subdirectory. So we
     * continue with traversal.
     * @param dir
     * @param exc
     * @return
     * @throws IOException
     */
    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        boolean searchFinished = Files.isSameFile(dir, startDir);
        if (searchFinished) {
            System.out.println("File: " + fileName + "not found");
            return FileVisitResult.TERMINATE;
        }
        return FileVisitResult.CONTINUE;
    }
}
