package chapter6;

public class SystemExitAndFinally {
    public static void main(String[] args) {
        try {
            throw new Exception("Exception is thrown in main");
            //System.exit(0);
        } catch(Exception e) {
            System.out.println(e.getMessage());
            System.exit(0);
        } finally {
            System.out.println("in finally");
        }
    }
}
