package daily0321;
import java.util.Scanner;
public class ch3P2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
//		for (int i = 0; i < line.length(); i++) {
//			System.out.print(line.charAt(i));
//		}
		for (int i = 0; i < line.length(); i++) {
			if((int)line.charAt(i) > 96) {
				System.out.print((char)((int)line.charAt(i)-32));
			} else if ((int)line.charAt(i) > 60 && (int)line.charAt(i) < 91) {
				System.out.print((char)((int)line.charAt(i)+32));
			} else if ((int)line.charAt(i) == 32){
				System.out.print(" ");
			} else {}
		}
	}
}

//소문자->대문자 : +32
//대문자->소문자 : -32
//a~z : 97~122
//A~Z : 65~90


//		for (int i = 0; i < line.length(); i++) {
//			int c = (int)line.charAt(i);
//			if () {
//				c = c + 32;
//			} else if() {
//				c = c - 32;
//			} else if(c == 32) {
//				c = c;
//			}
//		}
