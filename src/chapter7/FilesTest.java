package chapter7;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.Arrays;
import java.util.List;

public class FilesTest {
    public static void main(String[] args) {
        // copy file
        Path source = Paths.get("IO_for_ch07/java.jpeg");
        Path target = Paths.get("IO_for_ch07/java_copy.jpeg");
        try {
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // move file
        Path source2 = Paths.get("IO_for_ch07/java_copy.jpeg");
        Path target2 = Paths.get("IO_for_ch07/backup/java_backup.jpeg");
        try {
            Files.move(source2, target2, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException ex) {
            ex.printStackTrace();
        }


        // write and read to a text file
        Path textFile = Paths.get("IO_for_ch07/pome.txt");
        Charset charset = Charset.forName("utf8");
        String line1 = "Easy read and write";
        String line2 = "with java.nio.file.Files";
        List<String> lines = Arrays.asList(line1, line2);
        try {
            Files.write(textFile, lines, charset, StandardOpenOption.APPEND);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        List<String> linesRead = null;
        try {
            // read back
            linesRead = Files.readAllLines(textFile, charset);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        if (linesRead != null) {
            for (String line : linesRead) {
                System.out.println(line);
            }
        }
    }
    
}
