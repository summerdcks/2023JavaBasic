package Assignment0328;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ch6A3 {

	public static void main(String[] args) {
		System.out.println("이름 10개 입력");
		ArrayList<String> name = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			name.add(scanner.nextLine());
		}
		
		System.out.println("점수 10개 입력");
		ArrayList<Integer> score = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			try {
				score.add(scanner.nextInt());
			} catch (Exception e) {
				
			}
		}

		Collections.sort(name);				//오름차순 정렬
		System.out.println(name);
		
		Collections.reverse(name);			//내림차순 정렬
		System.out.println(name);
		
		Collections.sort(score);			//오름차순 정렬
		System.out.println(score);
		
		Collections.reverse(score);			//내림차순 정렬
		System.out.println(score);
	}

}
