package chapter7;

import java.io.*;

public class PrintStreamTest {
    public static void main(String[] args) throws IOException {
        //以PrintStream来包装FileOutputStream输出流
        try (PrintStream ps = new PrintStream(new FileOutputStream("IO_for_ch07/PrintStreamTestOutput.txt"))) {
            //使用PrintStream执行输出
            ps.println("普通字符串");
            ps.println(new PrintStreamTest());
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
