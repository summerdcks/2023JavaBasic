package daily0320;
import java.util.Scanner;

public class ch2A6 {
//약수
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				System.out.println(i);
			}
		}
	}
}
