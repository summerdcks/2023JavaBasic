package Assignment;

import java.util.Scanner;

public class ch4A3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		
		int number = m / n;
		int sum = ((1 + number) * number / 2) * n;
		System.out.print("SUM : " + sum + "(");
		
		for (int i = 1; i <= m; i++) {
			if (i % n == 0) {
				if (i == number*n) {
					System.out.print(i);
					break;
				}
				System.out.print(i);
				System.out.print(", ");					
			}
		}
		System.out.println(")");
	}

}
