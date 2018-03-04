package chapter4.GenericList;

import java.util.*;
public class ListTest {
	public static void main(String[] args) {
		// 创建一个只想保存字符串的List集合
		List strList = new ArrayList();
		strList.add("疯狂Java讲义");
		strList.add("疯狂Android讲义");
		strList.forEach(str -> System.out.println(((String)str).length())); 
	}
}
