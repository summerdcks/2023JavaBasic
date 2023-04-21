package Assignmnet0327;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ch5A3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line1 = scanner.nextLine();
		
		char[] sentence = line1.toCharArray();
		ArrayList<Character> line2 = new ArrayList<Character>();
		
		for (int i = 0 ; i < sentence.length; i++) {
			System.out.print((char)((int)sentence[i]-25));
			line2.add((char)((int)sentence[i]-25));
			
		}
		System.out.println();
		System.out.println("original = " + Arrays.toString(sentence));
		System.out.println("encrypted = " + line2);
	}
}
