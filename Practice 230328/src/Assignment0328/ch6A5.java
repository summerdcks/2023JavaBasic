package Assignment0328;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ch6A5 {

	public static void main(String[] args) {
		int[] numbers = {123, 32, 356, 53, 2, 67, 31, 78, 41, 9, 29};
		Scanner scanner = new Scanner(System.in);
		int numb = 0;
		while (true) {
			try {
				numb = scanner.nextInt();
				if (numb < 0 || numb >=10) {
					System.out.println("0~9를 입력하시오");
					continue;
				}
			} catch (Exception e) {
				System.out.println("숫자를 입력하시오");
				scanner.nextLine();
				continue;
			}
			for (int i = 0; i < numbers.length; i++) {
				String a = Integer.toString(numbers[i]);
				for (int j = 0; j < a.length(); j++) {
					if (a.charAt(j) == Integer.toString(numb).charAt(0)) {
						System.out.println(numbers[i]);
					}
				}			
			}
			break;
		}
	}	
}
