package daily0320;
import java.util.Scanner;

public class ch2A7 {
//최소공배수
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberN = scanner.nextInt();
		int numberM = scanner.nextInt();
		int GCD=0;
		if (numberN < numberM) {
			for (int i = numberN; i > 0; i--) {
				if (numberN % i == 0 && numberM % i == 0) {
					GCD = i;
					break;
				}
			}
		} else if (numberM < numberN) {
			for (int j = numberM; j > 0; j--) {
				if (numberN % j == 0 && numberM % j == 0) {
					GCD = j;
					break;
				}
			}
		} else {
			GCD = numberM;
		}
		int LCM = numberN*numberM/GCD;
		System.out.println(LCM);
	}
}