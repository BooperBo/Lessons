package javaio;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtils {

    public void printIOFileDetails(String path) throws IOException {
        File file = new File(path);

        // Get path details
        System.out.println("Absolute path " + file.getAbsolutePath());
        System.out.println("Relative path " + file.getPath());
        System.out.println("Free space  in MBytes " + file.getFreeSpace() / 1000000);
        System.out.println("Parent directory " + file.getParent());
        System.out.println("Is absolute path " + file.isAbsolute());

        System.out.println("Current directory is : " + System.getProperty("user.dir"));

        if (file.isDirectory()) {
            System.out.println("It is a directory. Printing content");
            String[] list = file.list();
            if (list != null) {
                for (String el : list) {
                    System.out.println(el);
                }
            } else {
                System.out.println("It is a file");
                System.out.println("Creating a new file " + file.createNewFile());
                // Permissions
                System.out.println("Can read " + file.canRead());
                System.out.println("Can write " + file.canWrite());
                System.out.println("Can execute " + file.canExecute());
                System.out.println("File is hidden " + file.isHidden());
                System.out.println("Last modified " + file.lastModified());
                System.out.println("Deleting file " + file.delete());

                Path filePath = file.toPath();
            }
        }
    }

    public void printNioFileDetails(String fileName) throws IOException {

        Path path = Paths.get(fileName);
        Path path1 = FileSystems.getDefault().getPath(fileName);
        Path path2 = Paths.get(System.getProperty("user.dir"), fileName);

        System.out.println("File name " + path.getFileName());
        Path absolutePath = path.toAbsolutePath();
        System.out.println("Root dir " + absolutePath.getRoot());
        System.out.println("Parent dir " + absolutePath.getParent());
        System.out.println("Name count" + path.getNameCount());
        System.out.println("Sub-path " + absolutePath.subpath(0, 3));
        Path path3 = Paths.get("../../");
        System.out.println("Real path " + path3.toRealPath());

    }
}
