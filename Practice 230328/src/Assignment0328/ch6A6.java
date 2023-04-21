package Assignment0328;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ch6A6 {

	public static void main(String[] args) {
		while (true) {
			Scanner scanner = new Scanner(System.in);
			int N = 0;
			int M = 0;
			try {
				N = scanner.nextInt();
				M = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("숫자를 입력하시오");
				scanner.next();
				continue;
			}

			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= M; j++) {
					System.out.println(i + "," + j);
				}
			} 
			break;
		}	
	}
}

