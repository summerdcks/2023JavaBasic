package Lecture;

public class ThreadSleep2 {

	public static void main(String[] args) {
		while(true) {
			int number = (int)(Math.random() * 46);
			if (number != 0) {							//0이 안나오고 딜레이가 없게 수정요함
				System.out.println(number);
			}
		
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}		
		}
	}
}
