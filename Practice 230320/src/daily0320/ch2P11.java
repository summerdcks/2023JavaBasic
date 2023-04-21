package daily0320;
import java.util.Scanner;

public class ch2P11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i=2 ; i<10; i++) {
			System.out.println(n + "*" + i + "=" + n*i);	
		}
	}
}
