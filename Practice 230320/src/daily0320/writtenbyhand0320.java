package daily0320;
import java.util.Scanner;

public class writtenbyhand0320 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		long multi =1;
		if (n > 0) {
			for (int i = 1; i <= n; i++) {
				multi = multi * 2;				
			}
		} else if (n < 0) {
			for (int j = 1; j <=(-n); j++) {
				multi = multi / 3;		
			}
		} else if (n == 0) {
			multi = 1;
		}
		System.out.println(multi);
	}
}
