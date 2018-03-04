package chapter3;

public class PrimitiveTransferTest {
	public static void swap(int a, int b) {
		// 下面三行代码实现a、b变量的值交换。
		int tmp = a;  // 定义一个临时变量来保存a变量的值
		a = b;  // 把b的值赋给a	
		b = tmp;  // 把临时变量tmp的值赋给a
		System.out.println("swap方法里，a的值是"
				+ a + "；b的值是" + b);
	}

	public static void main(String[] args) {
		int a = 6, b = 9;
		PrimitiveTransferTest.swap(a, b);
		System.out.println("交换结束后，变量a的值是"
				+ a + "；变量b的值是" + b);
	}
}
