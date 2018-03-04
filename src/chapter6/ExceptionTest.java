package chapter6;

public class ExceptionTest {
    public static void main(String[] args) {
        int i = 1, j = 0, k;
//        k = i/j;
        try {
            k = i / j;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            if (e instanceof ArithmeticException) {
                System.out.println("除零异常");
            } else {
                System.out.println(e.getMessage());
            }
        } finally {
            System.out.println("execute the finally code block.");
        }
    }
}