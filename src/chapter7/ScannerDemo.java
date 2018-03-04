package chapter7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(new BufferedReader(
				new FileReader("IO_for_ch07/ScannerDemoInput.txt")));) {
			scanner.useDelimiter("[,|^]");
			while (scanner.hasNext()) {
				System.out.println(scanner.next());
			}
			System.out.println("Done!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
