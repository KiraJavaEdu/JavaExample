package chapter5;

class Address {
	String detail;
	public Address(String detail)
	{
		this.detail = detail;
	}
}
// 实现Cloneable接口
class User implements Cloneable {
	int age;
	Address address;
	public User(int age, String detail) {
		this.age = age;
		address = new Address(detail);
	}
	// 通过调用super.clone()来实现clone()方法
//	public Object clone() throws CloneNotSupportedException {
//		return super.clone();
//	}

	// 通过调用super.clone()来实现clone()方法
	public User clone() throws CloneNotSupportedException {
		return (User)super.clone();
	}

//	public static void main(String[] args)
//			throws CloneNotSupportedException {
//		User u1 = new User(29, "江苏无锡");
//		// clone得到u1对象的副本。
//		User u2 = u1.clone();
//		// 判断u1、u2是否相同
//		System.out.println(u1 == u2);
//		// 判断u1、u2的age字段是否相同
//		System.out.println(u1.age == u2.age);
//		// 判断u1、u2的address是否相同
//		System.out.println(u1.address == u2.address);
//	}
}

public class ObjectCloneTest {
	public static void main(String[] args)
			throws CloneNotSupportedException {
		User u1 = new User(29, "江苏无锡");
		// clone得到u1对象的副本。
		User u2 = u1.clone();
		// 判断u1、u2是否相同
		System.out.println(u1 == u2);
		// 判断u1、u2的age字段是否相同
		System.out.println(u1.age == u2.age);
		// 判断u1、u2的address是否相同
		System.out.println(u1.address == u2.address);
	}
}
