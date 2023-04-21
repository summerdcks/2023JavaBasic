package daily0317;

import java.util.Scanner;

public class ch1P12 {
	public static void main(String[] args) {
		System.out.println("Input the 1st number!");
		Scanner scanner = new Scanner(System.in);
		int numberOne = scanner.nextInt();
		System.out.println("Input the 2st number!");
		int numberTwo = scanner.nextInt();
		int result = numberOne + numberTwo;
		System.out.printf("Result : %d+%d=%d", numberOne, numberTwo, result);
	}
}