package chapter5;

import java.util.*;

public class MapTest
{
	public static void main(String[] args) {
		Map<String, Double> map = new HashMap<>();
		map.put("肖申克的救赎" , 9.6);
		map.put("这个杀手不太冷" ,9.4);
		map.put("霸王别姬" , 9.5);
		map.put("千与千寻" , 9.2);
		System.out.println(map.put("千与千寻" , 9.3));
		System.out.println(map);
		System.out.println("是否包含值为 霸王别姬 的key"
			+ map.containsKey("霸王别姬")); // true
		for (Object key : map.keySet() )  {
			System.out.println(key + "-->" + map.get(key));
		}
		map.remove("这个杀手不太冷");
		System.out.println(map);
	}
}
