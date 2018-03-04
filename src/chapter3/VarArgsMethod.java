package chapter3;

class VarArgsMethod {
	// 定义了形参个数可变的方法
	public static void test(int a , String... books) {
		// books被当成数组处理
		for (String tmp : books) {
			System.out.println(tmp);
		}
		// 输出整数变量a的值
		System.out.println(a);
	}

	public static void main(String[] args) {
		VarArgsMethod.test(5 , "疯狂Java讲义" , "轻量级Java EE企业应用实战");
		//VarArgsMethod.test(5 , new String[] {"疯狂Java讲义" , "轻量级Java EE企业应用实战"});
	}
}
