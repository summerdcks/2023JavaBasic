package daily0317;

import java.util.Scanner;

public class ch2P5 {
	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if (number == 1) {
			System.out.println("One!");
		} else {
			System.out.println("Not One!");
		}

		int n = scanner.nextInt();
		if (n == 1) {
			System.out.println("One");
		} else if (n == 2) {
			System.out.println("Two");
		} else if (n == 3) {
			System.out.println("Three");
		} else {
			System.out.println("Except 1, 2, 3");
		}

	}
}