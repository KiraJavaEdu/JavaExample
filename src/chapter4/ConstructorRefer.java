package chapter4;

import javax.swing.*;

@FunctionalInterface
interface YourTest {
	JFrame win(String title);
}

public class ConstructorRefer {
	public static void main(String[] args) {
		// 下面代码使用Lambda表达式创建YourTest对象
		YourTest yt = (String a) -> new JFrame(a);
		// 构造器引用代替Lambda表达式。
		// 函数式接口中被实现方法的全部参数传给该构造器作为参数。
		// YourTest yt = JFrame::new;
		JFrame jf = yt.win("我的窗口");
		jf.setSize(200, 100);
		jf.setVisible(true);

		System.out.println(jf);
  }
}

