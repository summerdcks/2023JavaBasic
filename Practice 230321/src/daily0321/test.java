package daily0321;
import java.util.Scanner;
public class test {

	public static void main(String[] args) {
//1		
		char a;
		char b;
		char c;
		Scanner scanner = new Scanner(System.in);
		String line = scanner.next();
		while(true) {
			a = line.charAt(0);
			b = line.charAt(1);
			c = line.charAt(2);
//2 소문자 97~122
			if ((int)a <=122 && (int)a >=96
					&& (int)b <=122 && (int)b >=96
					&& (int)c <=122 && (int)c >=96) {
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				break;
			} else {
				System.out.println("소문자를 재입력하시오");
			}
		}
//3 내림차순
		
		int numb1 = (int)a;
		int numb2 = (int)b;
		int numb3 = (int)c;
		if (numb1 > numb2) { 
			numb1 = (int)b;
			numb2 = (int)a;
		} else {}
		if (numb1 > numb3) { 
			numb1 = (int)c;
			numb3 = (int)a;
		} else {}
		if (numb2 > numb3) { 
			numb2 = numb3;
			 
		} else {}
		System.out.println((char)numb1);
		System.out.println((char)numb2);
		System.out.println((char)numb3);

		
		
		

//4	오름차순
		int numb4 = (int)a;
		int numb5 = (int)b;
		int numb6 = (int)c;
		if (numb4 < numb5) { 
			numb4 = (int)b;
			numb5 = (int)a;
		} else {}
		if (numb4 < numb6) { 
			numb4 = (int)c;
			numb6 = (int)a;
		} else {}
		if (numb4 < numb5) { 
			numb4 = numb5;
			 
		} else {}
		System.out.println((char)numb4);
		System.out.println((char)numb5);
		System.out.println((char)numb6);
		
//5 대문자 65~90
		for ( int i = 0; i < line.length(); i++) {
			int number = (int)line.charAt(i);
				System.out.print((char)(number-32));
		}
	}
		
//6 알파벳사이 간격출력

}

