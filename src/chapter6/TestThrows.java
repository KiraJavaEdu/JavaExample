package chapter6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestThrows {
    public static void main(String[] args)
        throws FileNotFoundException
    {
        FileInputStream fis = new FileInputStream("a.txt");
    }
}
