package daily0320;

public class ch2A1 {
	
	public static void main(String[] arg) {
		
		for (int i = 2; i <= 9; i++) {
			if (i % 2 == 0) {
				for ( int j = 2; j <= 9; j++) {
					System.out.println(i + "*" + j + "=" + i*j +"\t"+ + (i+1) + "*" + j + "=" + (i+1)*j);
				}
			}		
		}
	}
}

	

//응용