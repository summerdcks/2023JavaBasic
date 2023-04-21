package Assignment0330;
import java.util.Scanner;
public class ch3A10sort안씀 {

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
			
			
			
			if (count != redundant) {	
				System.out.println("no");
				break;
			} 
			if(i == word.length()-1) {
				System.out.println("yes");
			}
		}
		
	
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
