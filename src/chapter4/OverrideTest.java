package chapter4;

class Bird {
	// Bird类的fly()方法
	public void fly() {
		System.out.println("我在天空里自由自在地飞翔...");
	}
}
class Ostrich extends Bird {
	// 重写Bird类的fly()方法
	public void fly() {
		System.out.println("我只能在地上奔跑...");
	}
}
public class OverrideTest {
	public static void main(String[] args){
		// 创建Ostrich对象
		Ostrich os = new Ostrich();
		// 执行Ostrich对象的fly()方法，将输出"我只能在地上奔跑..."
		os.fly();
	}
}
