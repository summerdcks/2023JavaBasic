package Lecture;

public class PracticeTryCatch2 {

	public static void main(String[] args) {
		int[] numbers = {5,10,12};
		try {
			System.out.println(numbers[2]);
		} catch (Exception e) {
		
		} catch (ArrayIndexOutOfBoundsException e) {
			
		} finally {
			System.out.println("finally");
		}

	}

}

//이미 general Exception이 에러를 다 잡아줘서 ArrayIndexOutOfBoundsException 이 필요없음