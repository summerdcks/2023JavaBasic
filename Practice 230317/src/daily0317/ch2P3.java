package daily0317;
import java.util.Scanner;

public class ch2P3 {
		public static void main(String[] arg) {
			System.out.println("지불한 금액과 청구된 금액을 입력하시오.");
			Scanner scanner = new Scanner(System.in);
			int number1 = scanner.nextInt();
			int number2 = scanner.nextInt();
			int change = number1 - number2;
			System.out.println(change);
			System.out.println("10000 -" + change / 10000);
			System.out.println("5000 -" + change % 10000 / 5000);
			System.out.println("1000 -" + change % 5000 / 1000);
			System.out.println("500 -" + change % 1000 / 500);
			System.out.println("100 -" + change % 500 / 100);
			System.out.println("50 -" + change % 100 / 50);
			System.out.println("10 -" + change % 50 / 10);
		}
	}