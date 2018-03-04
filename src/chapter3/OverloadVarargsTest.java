package chapter3;

public class OverloadVarargsTest {
	public void test(String msg) {
		System.out.println("只有一个字符串参数的test方法 ");
	}
	// 因为前面已经有了一个test()方法，test()方法里有一个字符串参数。
	// 此处的长度可变形参里不包含一个字符串参数的形式
	public void test(String... books) {
		System.out.println("****形参长度可变的test方法****");
	}

    public static void main(String[] args) {
		OverloadVarargsTest olv = new OverloadVarargsTest();
		olv.test();
		olv.test("aa");
		olv.test(new String[]{"aa"});
		olv.test("aa" , "bb");
	}
}

