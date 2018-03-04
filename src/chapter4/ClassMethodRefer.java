package chapter4;

@FunctionalInterface
interface MyTest
{
	String test(String a , int b , int c);
}
public class ClassMethodRefer {
	public static void main(String[] args) {
		// 下面代码使用Lambda表达式创建MyTest对象
		MyTest mt = (a , b , c) -> a.substring(b , c);
		// 方法引用代替Lambda表达式：引用某类对象的实例方法。
		// 函数式接口中被实现方法的第一个参数作为调用者，
		// 后面的参数全部传给该方法作为参数。
		// MyTest mt = String::substring;
		String str = mt.test("Java I Love you" , 2 , 9);
		System.out.println(str); // 输出:va I Lo
	}
}
