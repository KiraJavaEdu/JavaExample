package chapter4;

class BaseClass {
	public int a = 5;
}
class SubClass extends BaseClass {
	public int a = 7;
	public void accessOwner(){
		System.out.println(a);
	}
	public void accessBase(){
		// 通过super来访问从父类继承得到的被隐藏的实例变量a
		System.out.println(super.a);
	}
}
public class SuperProperty {
	public static void main(String[] args){
		SubClass sc = new SubClass();
		sc.accessOwner(); // 输出7
		sc.accessBase(); // 输出5
	}
}
