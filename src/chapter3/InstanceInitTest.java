package chapter3;

class InstanceInitTest1{
	{
		a = 6;
	}
	int a = 9;
}
class InstanceInitTest2{
	int a = 9;
	{
		a = 6;
	}
}
public class InstanceInitTest {
	public static void main(String[] args) {
		System.out.println(new InstanceInitTest1().a);
		System.out.println(new InstanceInitTest2().a);
	}
}