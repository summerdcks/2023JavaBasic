package daily0320;
import java.util.Scanner;

public class ch2P13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= n; i = i + m) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
}
