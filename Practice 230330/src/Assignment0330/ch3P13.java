package Assignment0330;
import java.util.Scanner;
public class ch3P13 {

	public static void main(String[] args) {
		String line = inputSentence();
		String word = inputWord();
		
		
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < word.length(); i++) {
			int count = 0;
			int redundant = 0;
			for (int j = 0; j < word.length(); j++) {
				if (word.charAt(i) == word.charAt(j)) {
					redundant++;
				}
			}
			
			for (int h = 0; h < line.length(); h++) {
				if (word.charAt(i) == line.charAt(h)) {
					count++;
				}
			} 
			
			count = count / redundant;
			
			if (count < min) {
				min = count;
				
			} 
		}
		System.out.println(min);
	}
	
	public static String inputSentence() {
		Scanner scanner = new Scanner(System.in);
		String sentence = scanner.nextLine();
		return sentence;
	}
	
	public static String inputWord() {
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();
		return word;
	}
}
