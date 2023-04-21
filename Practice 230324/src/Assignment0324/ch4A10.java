package Assignment0324;

import java.util.Arrays;
import java.util.Scanner;

public class ch4A10 {

	public static void main(String[] args) {
		while(true) {
			Scanner scanner = new Scanner(System.in);
			String lineOne = scanner.nextLine();
			String lineTwo;
			while(true) {
				lineTwo = scanner.nextLine();
				if (lineTwo.length() == lineOne.length()) {
					break;
				} else {
					System.out.println("첫 문자열과 문자수가 같은 문자열을 다시 입력하시오");
				}
			}
			char[] FstLine = lineOne.toCharArray();
			char[] SndLine = lineTwo.toCharArray();
			
			Arrays.sort(FstLine);				
			Arrays.sort(SndLine);
		
			if (Arrays.equals(FstLine, SndLine)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}
