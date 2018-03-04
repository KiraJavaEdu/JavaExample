package chapter4.NativeDemo;

public class NativeDemo {
    public native void displayHelloWorld();

    static
    {
        System.loadLibrary("hello");
    }

    public static void main(String[] args) {
        new NativeDemo().displayHelloWorld();
    }
}
