package daily0317;

import java.util.Scanner;

public class Operator3 {
	public static void main(String[] arg) {
		int x = 10;
		int y = 20;
		System.out.println(x < 5 && y > 10);
		System.out.println(x < 5 || y > 10);
		System.out.println(x >= 5 || y <= 10);
		int a = 6;
		int b = 6;
		a = a + 1;
		b = b + 1;
		System.out.println(a > b);
		++a;
		System.out.println(a > b++);
		++a;
		System.out.println(a);
		System.out.println(a % b);
		new Scanner(System.in);
		int i = 3;
		int j = 5;
		if (i > j) {
			System.out.println("i is greater than j");
		} else {
			System.out.println("j greater than i or j and i are the same");
		}

	}
}