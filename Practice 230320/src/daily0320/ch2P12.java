package daily0320;
import java.util.Scanner;

public class ch2P12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long number = scanner.nextInt();
		long sum=0;
		for( long i = 1; i <= number; i++) {
		sum = sum + i;
		}
		System.out.println(sum);
	}

}

