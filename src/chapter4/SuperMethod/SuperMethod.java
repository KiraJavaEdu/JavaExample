package chapter4.SuperMethod;

class Bird {
	// Bird类的fly()方法
	public void fly() {
		System.out.println("我在天空里自由自在地飞翔...");
	}
}

class Ostrich extends chapter4.SuperMethod.Bird {
	// 重写Bird类的fly()方法
	public void fly() {
		System.out.println("我只能在地上奔跑...");
	}
	public void callOverridedMethod() {
		// 在子类方法中通过super来显式调用父类被覆盖的方法。
		super.fly();
	}
}

public class SuperMethod {
	public static void main(String[] args){
		// 创建Ostrich对象
		chapter4.SuperMethod.Ostrich os = new chapter4.SuperMethod.Ostrich();
		// 执行Ostrich对象的fly()方法，将输出"我只能在地上奔跑..."
		os.fly();
		os.callOverridedMethod();
	}
}
