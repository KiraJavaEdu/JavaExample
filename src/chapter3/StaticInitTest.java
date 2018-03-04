package chapter3;

class StaticInitTest1 {
	static {
		a = 6;
	}
	static int a = 9;
}	
class StaticInitTest2 {
	static int a = 9;
	static {
		a = 6;
	}
}	
public class StaticInitTest {
	public static void main(String[] args) {
		System.out.println(StaticInitTest1.a);
		System.out.println(StaticInitTest2.a);
	}
}
