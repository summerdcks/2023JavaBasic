package Assignment0323;

import java.util.Scanner;

public class ch4A5 {

	public static void main(String[] args) {
		while(true) {
			System.out.println(getLine());
			System.out.println("PASS");
		}	
	}
	public static String getLine() {
		Scanner scanner = new Scanner(System.in);
		String line;
		while (true) {
			line = scanner.nextLine();
			if ( line.length() >= 10 		//10문자 이상, k를 포함
				&& line.contains("k")		//!~* 중 특수문자를 포함, 0~9 중 숫자를 포함
				&& (line.contains("1")||line.contains("2")||line.contains("3")||line.contains("4")||line.contains("5") ||line.contains("6")
						||line.contains("7")||line.contains("8")||line.contains("9")||line.contains("0"))
				&& (line.contains("!") || line.contains("@") || line.contains("#") || line.contains("$") || line.contains("%") || line.contains("^")
						|| line.contains("&") || line.contains("*")) ) {
				break;
			} 
			System.out.print("FAIL\n->");
		}
		return line;
	}
}
