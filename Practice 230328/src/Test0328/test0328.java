package Test0328;

import java.util.ArrayList;

public class test0328 {
//			1. 다른 클래스에서는 접근 불가능한 getRandomFloatNumber() 함수를 선언하고, return data type은 float형임[1점]
//
//			2. 1번에서 만든 함수의 내용
//			math.random() 함수를 실행시켜 소숫점 셋째자리에서 반올림하여 둘째자리까지만 return 함
//
//			3. 해당 클래스에서만 접근 가능한
//			getCount() 함수를 선언하고 return data type은 int형임.
//
//			4. 3번에서 만든 함수의 내용
//			getRandomFloatNumber()를 반복호출하여 값을 누적시킴. 그래고 매 회차마다 값을 출력함. 그래서 10을 초과할 때까지 몇 회인지 확인함.
//			예) 0.23 0.33 0.51 ..... -> 34
//
//			5. main() 함수에서는 getRandomFloatNumber()를 호출하여 10 초과까지의 히스토리와 몇 회가 소요되었는지 출력함.
//			
	public static void main(String[] args) {
		getRandomFloatNumber();
		int count = getCount();
		System.out.println(count);
	}

	
	
	private static float getRandomFloatNumber() {
		double a = Math.floor(Math.random()*100) / 100;
		return (float)a;
	}
	
	private static int getCount() {
		int count = 0;
		float sum = 0;
		ArrayList<Float> FloatNumber = new ArrayList<Float>();
		while (true) {
			float number = getRandomFloatNumber();
			FloatNumber.add(number);
			count++;
			sum = sum + number;
			if(sum > 10) {
				System.out.println(FloatNumber);
				break;
			}		
		}
		return count;
	}
}



