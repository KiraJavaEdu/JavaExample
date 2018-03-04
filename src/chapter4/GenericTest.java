package chapter4;

// 定义Apple类时使用了泛型声明
class Book<T> {
	// 使用T类型形参定义实例变量
	private T info;

	public Book() {
	}

	// 下面方法中使用T类型形参来定义构造器
	public Book(T info) {
		this.info = info;
	}

	public void setInfo(T info) {
		this.info = info;
	}

	public T getInfo() {
		return this.info;
	}
}

public class GenericTest {
	public static void main(String[] args) {
		// 由于传给T形参的是String，所以构造器参数只能是String
		Book<String> a1 = new Book<>("好好说话");
		System.out.println(a1.getInfo());
		// 由于传给T形参的是Double，所以构造器参数只能是Double或double
		Book<Double> a2 = new Book<>(5.67);
		System.out.println(a2.getInfo());
	}
}
