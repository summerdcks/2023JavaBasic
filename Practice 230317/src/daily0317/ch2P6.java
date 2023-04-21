package daily0317;

import java.util.Scanner;

public class ch2P6 {
	public static void main(String[] arg) {
		System.out.println("What operation do you want?\n\n1. +\n\n2. -\n\n3. *\n\n4. /\n\n--->");
		Scanner scanner = new Scanner(System.in);
		int oper = scanner.nextInt();
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		if (oper == 1) {
			System.out.println(number1 + number2);
		} else if (oper == 2) {
			System.out.println(number1 - number2);
		} else if (oper == 3) {
			System.out.println(number1 * number2);
		} else if (oper == 4) {
			System.out.println(number1 / number2);
		} else {
			System.out.println("잘못 입력하셨습니다");
		}

	}
}