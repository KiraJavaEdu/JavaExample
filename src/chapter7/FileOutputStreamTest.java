package chapter7;

import java.io.*;

public class FileOutputStreamTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //创建字节输入流
            fis = new FileInputStream("src/chapter7/FileOutputStreamTest.java");
            //创建字节输入流
            fos = new FileOutputStream("IO_for_ch07/FileOutputStreamTestOutput.txt");
            byte[] bbuf = new byte[32];
            int hasRead = 0;
            //循环从输入流中取出数据
            while ((hasRead = fis.read(bbuf)) > 0) {
                //每读取一次，即写入文件输出流，读了多少，就写多少。
                fos.write(bbuf, 0, hasRead);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            if (fis != null)
                fis.close(); //使用finally块来关闭文件输入流
            if (fos != null)
                fos.close(); //使用finally块来关闭文件输出流
        }
    }
}
