package Practice;

public class RecursiveFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			System.out.println(sumToOne(i));
		}
	}
	
	public static int sumToOne(int number) {
		if (number == 1) {
			return 1;
		} else {
			return number + sumToOne(--number);
		}
	}
}

//RecursiveFunction
//재귀함수
//반복문을 안쓰고 반복해주는 함수
//끝나는 지점을 잘 지정해줘야 함 안그럼 무한대로 감
//코드가 복잡함 일반적으로 if씀