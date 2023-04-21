package daily0320;
import java.util.Scanner;

public class ch2A4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int line = scanner.nextInt();
		System.out.println(line);
		
		for(int i = 0; i < line; i++) {
			for(int j = line-i; j>0; j--) {
				System.out.print(" ");
			}
			for(int h=0; h <2*i+1; h++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
	


