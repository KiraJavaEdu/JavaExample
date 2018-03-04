import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Convert {
    public static void convert(String src, String dest,String pack) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(src), "GBK"));
               BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(dest), "utf8"))) {
            String s = null;
            StringBuffer sb = new StringBuffer();
            sb.append(pack);
            //sb.append("package chapter4;\n\n");
            while ((s = in.readLine()) != null) {
                sb.append(s + "\n");
            }
            out.write(sb.toString());
            System.out.println(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        boolean file = !false;
        String pack = "package chapter4";
        if (file) {
            String filename = "SuperConstructor.java";
            convert(filename, "src/chapter4/" + filename, pack + ";\n\n");
        } else {
            String dirname = "UpperBound";
            Path dir = Paths.get(dirname);
            try {
                DirectoryStream<Path> children = Files.newDirectoryStream(dir);
                for (Path child : children) {
                    convert(dirname + "/" + child.getFileName(), "src/chapter4/" + dirname + "/" + child.getFileName(),
                            pack + "." + dirname + ";\n\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
