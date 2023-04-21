package daily0320;
import java.util.Scanner;

public class ch2A5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int line = scanner.nextInt();
		
		for(int i = 0; i < line; i++) {
			for(int j = 1; j < i+1; j++) {
				System.out.print(" ");
			}
			for(int h = 2*(line-i)-1; h > 0; h -= 1) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
	
