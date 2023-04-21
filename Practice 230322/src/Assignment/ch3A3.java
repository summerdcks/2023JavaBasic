package Assignment;

public class ch3A3 {

	public static void main(String[] args) {
		String line = "I go to school";
		char[] c = line.toCharArray();
		for (int i = 65; i <=90; i++) {
			int count = 0;
			for (int j = 0; j < line.length(); j++) {
				int number = (int)c[j];
				if (number == i || number == i+32) {
					count++;
				}	
			}
			if(count > 0) {
				System.out.println((char)i + " - " + count);
			}
		}
	}
}
