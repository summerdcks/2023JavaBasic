package Assignment0323;

import java.util.Scanner;

//사용자가 과목 수를 입력합니다.
//사용자가 각 과목의 단위를 입력합니다.
//사용자가 각 과목의 학점을 입력합니다(A+, A0, B+, ..., F).
//평균 학점을 부동 소수점 데이터 유형을 사용하여 출력합니다.

public class ch4A7 {
	public static final double APLUS = 4.5;
	public static final double AZERO = 4.0;
	public static final double BPLUS = 3.5;
	public static final double BZERO = 3.0;
	public static final double CPLUS = 2.5;
	public static final double CZERO = 2.0;
	public static final double FAIL = 0.0;	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int number = numberOfSubjects();				//과목수 입력
												
		int[] units = new int[number];					//단위 입력
		for (int i = 0; i < number; i++) {
			units[i] = scanner.nextInt();
		}	
		scanner.nextLine();
		String[] grade = new String[number];			//점수 입력
		float[] score = new float[number];
		for (int j = 0; j < number; j++) {
			grade[j] = scanner.nextLine();
			if (grade[j].equals("A+")) {
				score[j] = (float) APLUS;
			} else if (grade[j].equals("A0")) {
				score[j] = (float) AZERO;
			} else if (grade[j].equals("B+")) {
				score[j] = (float) BPLUS;
			} else if (grade[j].equals("B0")) {
				score[j] = (float) BZERO;
			} else if (grade[j].equals("C+")) {
				score[j] = (float) CPLUS;
			} else if (grade[j].equals("C0")) {
				score[j] = (float) CZERO;
			} else {
				score[j] = (float) FAIL;
			}
			System.out.println(score[j]);
		}
		
		float sumOfScores = 0;							//평균 계산
		int sumOfUnits = 0;
		for (int h = 0; h < number; h++) {
			sumOfScores = sumOfScores + units[h] * score[h];
			sumOfUnits = sumOfUnits + units[h];
		}
		float result = sumOfScores / sumOfUnits ;	
		
		System.out.println(result);						//출력
			
		}
		
		

	public static int numberOfSubjects() {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		return num;
	}	
}
