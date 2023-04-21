package Assignment0324;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ch5A5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		String[] words = line.split(" ");					//띄어쓰기 split
		
		Arrays.sort(words, Collections.reverseOrder());		//내림차순
		
		for (int i = 0; i < words.length; i++) {
			System.out.print(words[i] + " ");
		}
	}

}