package Assignmnet0327;

public class ch5A1 {

	public static void main(String[] args) {
		String[][] scores = {{"70","80","100"},{"60","70","86"},{"54","100","82"},{"87","95","79"}};
		
		//person i :0~3
		for (int i = 0; i < 4; i++) {
			int sum = 0;
			int ave = 0;
			int min = Integer.parseInt(scores[i][0]);
			int max = Integer.parseInt(scores[i][0]);
			
			for(int j = 0; j < 3; j++) {
	           sum = sum + Integer.parseInt(scores[i][j]);
	           min = Math.min(min, Integer.parseInt(scores[i][j]));
	           max = Math.max(max, Integer.parseInt(scores[i][j]));
	        }
			ave = sum/3;
		
			System.out.println("Student : " + i);
			System.out.println("Summation : " + sum);
			System.out.println("Average : " + ave);
			System.out.println("Minimum : " + min);
			System.out.println("Maximum : " + max);
			System.out.println();
		}
	
		//subject i : 0~2
		for(int i = 0; i < 3; i++) {
			int ssum = 0;
			int save = 0;
			int smin = Integer.parseInt(scores[0][i]);
			int smax = Integer.parseInt(scores[0][i]);
			for(int j = 0; j < 4; j++) {
	           ssum = ssum + Integer.parseInt(scores[j][i]);
	           smin = Math.min(smin, Integer.parseInt(scores[j][i]));
	           smax = Math.max(smax, Integer.parseInt(scores[j][i]));
	        }
			save = ssum/4;
		
			System.out.println("Subject : " + i);
			System.out.println("Summation : " + ssum);
			System.out.println("Average : " + save);
			System.out.println("Minimum : " + smin);
			System.out.println("Maximum : " + smax);
			System.out.println();		
		}
	}
}
