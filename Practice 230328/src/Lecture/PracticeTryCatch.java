package Lecture;

public class PracticeTryCatch {

	public static void main(String[] args) {
		int[] numbers = {5,10,12};
		System.out.println("1");
//		try {
//			System.out.println(numbers[2]);
//		} catch (Exception e) {
//			System.out.println("exception");
//			e.printStackTrace();		//어디서 에러났는지 알려줌
//		} finally {
//			System.out.println("finally");
//		}
		System.out.println(numbers[3]);		//에러발생하고
		System.out.println("9");			//출력안됨 프로그램 죽어버림
	}
}
