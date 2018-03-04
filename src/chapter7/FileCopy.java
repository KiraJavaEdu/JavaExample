package chapter7;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileCopy {
    public static void copyFiles(Path originPath, Path destPath)
            throws IOException {
        if (Files.notExists(originPath) 
                || Files.exists(destPath)) {
            throw new IOException(
                    "Origin file must exist and " + 
                    "Destination file must not exist");
        }
        byte[] readData = new byte[1024];
        try (InputStream inputStream = Files.newInputStream(originPath, 
                StandardOpenOption.READ);
            OutputStream outputStream = Files.newOutputStream(destPath,
                    StandardOpenOption.CREATE)) {
            int i = inputStream.read(readData);
            while (i != -1) {
                outputStream.write(readData, 0, i);
                i = inputStream.read(readData);
            }
        } catch (IOException e) {
            throw e;
        }
    }

    public static void main(String[] args) {
        Path origin = Paths.get("src/chapter7/FileCopy.java");
        Path destination = Paths.get("IO_for_ch07/FileCopyOutput.txt");
        try {
            copyFiles(origin, destination);
            System.out.println("Copied Successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}