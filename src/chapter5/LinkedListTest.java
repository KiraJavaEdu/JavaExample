package chapter5;

import java.util.*;
public class LinkedListTest {
	public static void main(String[] args) {
		// 创建一个LinkedList类实例，并向其中添加一百万个元素
		List<Integer> list = new LinkedList<>();
		for (int i = 0; i < 1_000_000; i++)
			list.add(i);
		long t1 = System.currentTimeMillis();
		for (int i : list)
			System.out.println(i);
		long t2 = System.currentTimeMillis();
		for (int i = 0; i < 1_000_000; i++)
			System.out.println(list.get(i));
		long t3 = System.currentTimeMillis();
		System.out.println("使用foreach循环的遍历时间："+(t2-t1));
		System.out.println("使用for循环搭配get方法的遍历时间："+(t3-t2));
	}
}
