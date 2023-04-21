package PrepareTest;
import java.util.ArrayList;
import java.util.Scanner;

public class TestReview2 {
	public static final int SCISSORS = 0;
	public static final int ROCK = 1;
	public static final int PAPER = 2;

	public static void main(String[] args) {
		
//		ArrayList<String> name = new ArrayList<String>();
//		name.add("abc");
//		name.remove(0);
		
//		String[] chars = new String[100];
//		String text = "red,blue,white,yellow";
//		chars = text.split(",");
//		for (int i = 0; i < chars.length; i++) {
//			System.out.println(chars[i]);
//		}
		
//		Integer[] numbers = new Integer[100];
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int i = 0; i < 100; i++) {
			numbers.add((int)(Math.random() * 101));
//			numbers[i] = (int)(Math.random() * 101);
			
		}
		for (int i = 0; i < 100; i++) {
			System.out.println(numbers.get(i));
//			System.out.println(numbers[i]);
		}
	}
}