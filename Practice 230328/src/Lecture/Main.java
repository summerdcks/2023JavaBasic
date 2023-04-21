package Lecture;

public class Main implements Runnable, java.lang.Runnable {
//다시해보기꼭
	public static void main(String[] args) {
		Main main = new Main();
		Thread thread = new Thread(main);
		thread.start();

	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread");
	}

}
