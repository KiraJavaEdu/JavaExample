package chapter5;

import java.util.*;

public class IteratorTest {
	public static void main(String[] args) {
		Collection<String> lucks = new HashSet<>();
		lucks.add("敬业福");
		lucks.add("爱国福");
		lucks.add("富强福");
		lucks.add("友善福");
		lucks.add("和谐福");
        System.out.println(lucks);

        lucks.forEach(obj -> System.out.println(obj));
        System.out.println("------------");
        // 获取lucks集合对应的迭代器
		Iterator<String> it = lucks.iterator();
		while(it.hasNext()) {
			// it.next()方法返回的是Object类型，因此需要强制类型转换
			System.out.println(it.next());
		}
        System.out.println("------------");

        for (String l : lucks) {
            System.out.println(l);
        }

        System.out.println("------------");
        it.forEachRemaining(obj -> System.out.println(obj));
        System.out.println("------------");
        Iterator<String> it2 = lucks.iterator();
        it2.forEachRemaining(obj -> System.out.println(obj));
	}
}
