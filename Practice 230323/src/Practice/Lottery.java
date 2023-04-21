package Practice;
public class Lottery {

	public static void main(String[] args) {	
		getRandomNumbers();
	}
	
	public static void getRandomNumbers() {
		int cnt = 0;
		int sum = 0;
		while(true) {
			int n2 = getRandomNumber();
			System.out.println(n2);
			cnt++;			
			sum = sum + n2;
			if (isValid(cnt, sum)) {
				break;
			}
		}	
	}
	
	
	//함수 : 1 ~ 45까지 리턴해주는 함수
	public static int getRandomNumber() {
		double n =0.0;
		int n2 = 0;
		while (true) {
			n = Math.random();
			n2 = (int)(n * 46);
			if (n2 != 0) {
				break;
			}
		}	
		return n2;
	}
	
	public static boolean isValid (int cnt, int sum) {
		boolean ret = false;
		int min = 48;
		int max = 238;
		if (cnt == 6) {
			if (sum >= min && sum <= max) {
				ret = true;						//리턴이 true면
			} else {
				System.out.println("retry");
				cnt = 0;
				sum = 0;
			}
		}
		return ret;
	}
	
}


