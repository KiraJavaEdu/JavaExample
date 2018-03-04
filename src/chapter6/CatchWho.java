package chapter6;

public class CatchWho {
    public static void main(String[] args) { 
        try { 
            try { 
                throw new ArrayIndexOutOfBoundsException(); 
            } catch(ArrayIndexOutOfBoundsException e) {
               System.out.println("数组越界异常 内层try-catch");
            }
            throw new ArithmeticException(); 
        } catch(ArithmeticException e) {
            System.out.println("发生ArithmeticException");
        } catch(ArrayIndexOutOfBoundsException e) {
           System.out.println(  "数组越界异常  外层try-catch");
        } 
    } 
}