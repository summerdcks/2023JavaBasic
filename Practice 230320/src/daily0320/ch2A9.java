package daily0320;
import java.util.Scanner;

public class ch2A9 {
//소수
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if (number >= 2) {
			System.out.println(2);
			
			for (int i = 2; i <= number; i++) {
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						break;
					} else if (i % j !=0) {
						if (j == i-1) {
							System.out.println(i);
						} else {
							continue;
						}
					}						
				}
			}
		} 
	}
}
