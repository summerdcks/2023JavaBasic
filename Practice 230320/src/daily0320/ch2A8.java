package daily0320;
import java.util.Scanner;

public class ch2A8 {
//최대공약수
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberN = scanner.nextInt();
		int numberM = scanner.nextInt();
		if (numberN < numberM) {
			for (int i = numberN; i > 0; i--) {
				if (numberN % i == 0 && numberM % i == 0) {
					System.out.println(i);
					break;
				}
			}
		} else if (numberM < numberN) {
			for (int j = numberM; j > 0; j--) {
				if (numberN % j == 0 && numberM % j == 0) {
					System.out.println(j);
					break;
				}
			}
		}
	}
}
