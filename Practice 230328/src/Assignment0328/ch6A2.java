package Assignment0328;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ch6A2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String numbers = scanner.nextLine();
		String[] nb = numbers.split(" ");
		
		Stack<Integer> st = new Stack<Integer>();
		for (int i = 0; i < nb.length; i++) {
			st.add(Integer.parseInt(nb[i]));
		}
		
		int input = scanner.nextInt();
		int count = 0;
		int a = 0;
		while (true) {
			try { 
				a = st.pop();
				count++;
			} catch (Exception e) {
				
			} 
			if (a == input) {
				System.out.println(count);
			}
		}
	}
}
