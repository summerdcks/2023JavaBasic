package Assignment0323;

import java.util.Scanner;

//당신의 스마트폰을 사용하여 웹 상에서 프로그램을 작성하세요.
//사용자의 입력 문자열에 따라 동적으로 작동하는 자음과 모음의 수를 세는 프로그램을 작성하세요.
//This is an apple
//자음의 수: 8
//모음의 수: 5
//I am fine
//자음의 수: 3
//모음의 수: 4
public class ch4A6 {
static int ctCon = 0;
static int ctVwl = 0;
static String line;

	public static void main(String[] args) {
		inputLine();							//문자열 입력
		countConsonant();						//자음의 갯수 세기
		countVowels();							//모음의 갯수 세기
		printResults();							//출력하기
	}
	
	public static void inputLine() {
		Scanner scanner = new Scanner(System.in);
		line = scanner.nextLine();
		System.out.println(line);
	}

	public static int countConsonant() {
		char[]ln = line.toCharArray();
			for (int j = 0; j < line.length(); j++) {
				int number = (int)ln[j];
				if (number == 65 || number == 69 || number == 73 || number == 79 || number == 85
					|| number == 97 || number == 101 || number == 105 || number == 111 || number == 117) {
				} else if (number != 32) {
					ctCon++;
				}
			}
		return ctCon;
	}
	
	public static int countVowels() {
		char[]ln = line.toCharArray();
			for (int j = 0; j < line.length(); j++) {
				int number = (int)ln[j];
				if (number == 65 || number == 69 || number == 73 || number == 79 || number == 85
					|| number == 97 || number == 101 || number == 105 || number == 111 || number == 117) {
					ctVwl++;
				}
			}
		return ctVwl;
	}
	
	public static void printResults() {
		System.out.println("Num. of Consonant : " + ctCon);
		System.out.println("Num. of Vowels : " + ctVwl);
	}
}