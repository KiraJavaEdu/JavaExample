package chapter6;

class MyException extends Exception {
    public MyException(String Message) {
        super(Message);
    }
    public MyException(String message, Throwable cause) {
        super(message, cause);
    }
    public MyException( Throwable cause) {
        super(cause);
    }
}

public class ExceptionLinkInRealWorld {
   public static void main( String args[] ) {
      try {
         throwExceptionMethod();  // 有可能抛出异常的方法调用
      } catch ( MyException e ) {
         System.err.println( e.getMessage() );
         System.err.println(e.getCause().getMessage());
      } catch ( Exception e ) {
         System.err.println( "Exception handled in main" );
      }
      doesNotThrowException(); //不抛出异常的方法调用
   }

   public static void throwExceptionMethod() throws MyException {
      try {
         System.err.println( "Method throwException" );
         throw new Exception("系统运行时引发的特定异常");  // 产生了一个特定异常
      } catch( Exception e ) {
         System.err.println(
            "Exception handled in method throwException" );
         //转换为一个自定义异常，再抛出
         throw new MyException("在方法执行时出现异常",e);
      } finally {
         System.err.println(
            "Finally executed in throwException" );
      }
   }

   public static void doesNotThrowException() {
      try {
         System.err.println( "Method doesNotThrowException" );
      } catch( Exception e ) {
         System.err.println( e.toString() );
      } finally {
         System.err.println(
            "Finally executed in doesNotThrowException" );
      }
      System.err.println(
         "End of method doesNotThrowException" );
   }
}

