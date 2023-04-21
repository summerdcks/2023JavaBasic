package Assignment0328;

import java.util.Scanner;

public class ch6A4 {

	public static void main(String[] args) {
	 System.out.println("문장입력");
	 Scanner scanner = new Scanner(System.in);
	 String line = scanner.nextLine();
	 System.out.println("문자입력");
	 String crt = scanner.nextLine();
	 char alphabet = crt.charAt(0);
	 int count = 0;
	 for (int i = 0; i < line.length(); i++) {
		 count++;
		 try {
			 if (line.charAt(i) == alphabet) {
				 System.out.println(count);
			 }
		 } catch (Exception e) {
			 
		 }
	 }
	}
}
