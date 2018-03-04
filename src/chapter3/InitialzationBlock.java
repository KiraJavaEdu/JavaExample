package chapter3;

class Personal {
	// 下面定义一个初始化块
	{
		int a = 6;
		if (a > 4)
		{
			System.out.println("Personal初始化块：局部变量a的值大于4");
		}
		System.out.println("Personal的初始化块");
	}
	// 定义第二个初始化块
	{
		System.out.println("Personal的第二个初始化块");
	}
	public Personal() {       // 定义无参数的构造器
		System.out.println("Personal类的无参数构造器");
	}
}
public class InitialzationBlock {
	public static void main(String[] args) {
		new Personal();
	}
}

