package chapter4.InterfaceTest;

public class Test {
		public static void main(String[] args) {
		// 创建一个Printer对象，当成Output使用
		Output o = new Printer();
		o.getData("轻量级Java EE企业应用实战");
		o.getData("疯狂Java讲义");
		o.out();
		o.getData("疯狂Android讲义");
		o.getData("疯狂Ajax讲义");
		o.out();
		// 调用Output接口中定义的默认方法
		o.print("孙悟空" , "猪八戒" , "白骨精");
		o.test();
		// 创建一个Printer对象，当成Product使用
		Product p = new Printer();
		System.out.println(p.getProduceTime());
		// 所有接口类型的引用变量都可直接赋给Object类型的变量
		Object obj = p;
	}
}
