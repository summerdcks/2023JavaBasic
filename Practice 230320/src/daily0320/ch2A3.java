package daily0320;
import java.util.Scanner;

public class ch2A3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int line = scanner.nextInt();
		System.out.println(line);
		
		for(int i = 0; i < line; i++) {
			for(int h=0; h <i+1; h++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
	