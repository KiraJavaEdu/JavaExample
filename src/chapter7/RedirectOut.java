package chapter7;

import java.io.*;

public class RedirectOut {

    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream(new FileOutputStream("IO_for_ch07/RedirectOutput.txt"))) {
            //将标准输出重定向到ps输出流
            System.setOut(ps);
            //向标准输出输出一个字符串
            System.out.println("普通字符串");
            //向标准输出输出一个对象
            System.out.println(new RedirectOut());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
