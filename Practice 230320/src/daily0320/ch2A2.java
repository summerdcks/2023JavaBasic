package daily0320;

public class ch2A2 {

	public static void main(String[] args) {
		int n =2;
		while(n < 10) {
			int i =2;
			while(i < 10) {
				switch (i) {
				case 2 :
					System.out.println(n + "x" + 2 + "=" + n*2);
					break;
				case 3 :
					System.out.println(n + "x" + 3 + "=" + n*3);
					break;
				case 4 :
					System.out.println(n + "x" + 4 + "=" + n*4);
					break;
				case 5 :
					System.out.println(n + "x" + 5 + "=" + n*5);
					break;
				case 6 :
					System.out.println(n + "x" + 6 + "=" + n*6);
					break;
				case 7 :
					System.out.println(n + "x" + 7 + "=" + n*7);
					break;	
				case 8 :
					System.out.println(n + "x" + 8 + "=" + n*8);
					break;
				case 9 :
					System.out.println(n + "x" + 9 + "=" + n*9);
					break;
				}
			i++;
			}
		n++;
		}
	}
}
