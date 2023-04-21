package Lecture;

public class TryCatch {
	public static void main(String[] args) {
		int[] numbers = new int[10];
		String[] name = {"kim", "lee", "park"};
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		try {
			System.out.println(name[2]);
		} catch(Exception e) {
			System.out.println("Error");
		}
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(name[i]);
		}
	}
}

// try { 				<1실행
// } catch ( ) {		<2에러발생시 catch
// }					<3종료

//try { 				<1실행
//} catch ( ) {			//에러가없을때
//}						<2종료