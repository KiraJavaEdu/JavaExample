package chapter4.GenericList;

import java.util.*;
public class GenericList {
	public static void main(String[] args) {
		// 创建一个只想保存字符串的List集合
		List<String> strList = new ArrayList<String>();  
		strList.add("疯狂Java讲义");
		strList.add("疯狂Android讲义");
		// 下面代码将引起编译错误
		// strList.add(5);    // ①
		strList.forEach(str -> System.out.println(str.length())); // ②
	}
}
