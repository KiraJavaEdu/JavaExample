package chapter4;

public class ObjectMethodRefer {

	@FunctionalInterface
	interface Converter {
		Integer convert(String from);
	}

	public static void main(String[] args) {
		// 下面代码使用Lambda表达式创建Converter对象
		Converter converter2 = from -> "fkit.org".indexOf(from);
		// 方法引用代替Lambda表达式：引用特定对象的实例方法。
		// 函数式接口中被实现方法的全部参数传给该方法作为参数。
		// Converter converter2 = "fkit.org"::indexOf;
		Integer value = converter2.convert("it");
		System.out.println(value); // 输出2
  }
}
