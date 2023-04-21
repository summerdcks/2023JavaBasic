package Lecture;

public class ThreadPractice {

	public static void main(String[] args) {
		boolean[] checkDup = new boolean[45];
		for (int i = 0; i < checkDup.length; i++) {
			checkDup[i] = false;
		}
		
		for (int i = 0; i < 6; i++) {
			while(true) {
				try {
					Thread.sleep(500);
					int n = getRandom();
					if (checkDup[n-1] == false) {
						System.out.println(n);
						checkDup[n-1] = true;
						break; 
					}
				} catch(Exception e) {
				}
			} 
		}	
	}
	

	public static int getRandom() {
		int ret = 0;
		int n = (int)(Math.random() * 46);
		ret = n;
		return ret;
	}
}

//try {
//	Thread.sleep(500);
//} catch (InterruptedException e) {
//	e.printStackTrace();
//}