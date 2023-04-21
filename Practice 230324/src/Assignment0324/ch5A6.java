package Assignment0324;

import java.util.ArrayList;
import java.util.Scanner;

public class ch5A6{
	//피보나치수열
		public static void main(String[] args) {
			ArrayList<Integer> pb = new ArrayList<Integer>();
			pb.add(0);
			pb.add(1);
			int n = -1;
			Scanner scanner = new Scanner(System.in);
			n = scanner.nextInt();
			
			if (n == 1) {
				System.out.println("[]");	
			} else if (n > 1) {
				for (int i = 2; i < n; i++) {
					int number = pb.get(i-1) + pb.get(i-2);
					pb.add(number);
				}
				System.out.println(pb);
			}
			
		}
}
