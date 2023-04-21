package daily0320;
import java.util.Scanner;

public class ch2P8 {
		public static void main(String[] arg) {
			System.out.println("What number do you want?");
			Scanner scanner = new Scanner(System.in);
			int number = scanner.nextInt();

			for (int i = 2; i <= 9; ++i) {
				System.out.printf("%d * %d = %d\n", number, i, number * i);
			}

		}
	}