package Assignment0328;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ch6A1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String numbers = scanner.nextLine();
		String[] nb = numbers.split(" ");
		
		Queue<Integer> qu = new LinkedList<>();
		for (int i = 0; i < nb.length; i++) {
			qu.add(Integer.parseInt(nb[i]));
		}
		
		int input = scanner.nextInt();
		int count = 0;
		int a = 0;
		while (true) {
			try { 
				a = qu.poll();
				count++;
			} catch (Exception e) {
				
			} 
			if (a == input) {
				System.out.println(count);
			}
		}
	}
}
