package chapter2;

public class ForEachTest {
	public static void main(String[] args) {
		String[] games = {"王者荣耀",
		"阴阳师",
		"绝地求生"};
		for (String game : games) {
			System.out.println(game);
		}
	}
}