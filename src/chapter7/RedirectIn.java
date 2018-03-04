package chapter7;

import java.io.*;
import java.util.*;

public class RedirectIn {

    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("src/chapter7/RedirectIn.java")) {
            //将标准输入重定向到fis输入流
            System.setIn(fis);
            //使用System.in创建Scanner对象，用于获取标准输入
            Scanner sc = new Scanner(System.in);
            //增加下面一行将只把回车作为分隔符
            sc.useDelimiter("\n");
            //判断是否还有下一个输入项
            while (sc.hasNext()) {
                //输出输入项
                System.out.println("重定向后的标准输入的内容是：" + sc.next());
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
