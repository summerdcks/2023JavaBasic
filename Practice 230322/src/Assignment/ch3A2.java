package Assignment;
import java.util.Scanner;

public class ch3A2 {

	public static void main(String[] args) {
		int positive = 0;
		int negative = 0;
		int odd = 0;
		int even = 0;
		
		while(true) {
			Scanner scanner = new Scanner(System.in);
			int num = scanner.nextInt();
			if (num > 0) {
				positive++;
			}
			if (num < 0) {
				negative++;
			}
			if (num % 2 != 0) {
				odd++;
			}
			if (num % 2 == 0) {
				even++;
			}
			System.out.print("P - " + positive);
			System.out.print(", N - " + negative);
			System.out.print(", O - " + odd);
			System.out.println(", E - " + even);
		}
	}
}
