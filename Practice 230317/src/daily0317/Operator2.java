package daily0317;

public class Operator2 {
	public static void main(String[] arg) {
		int x = 3;
		int y = 3;
		int z = 5;
		System.out.println(x == y);
		System.out.println(x != y);
		System.out.println(x > y);
		System.out.println(x < z);
		System.out.println(x >= z);
		System.out.println(y >= z);
		int a = 7;
		a = a + 3;
		System.out.println(a);
		a -= 3;
		System.out.println(a);
		a *= 3;
		System.out.println(a);
		a /= 3;
		System.out.println(a);
		a %= 3;
		System.out.println(a);
		a = 10;
		System.out.println(a);
		a = a & 3;
		System.out.println(a);
		a |= 3;
		System.out.println(a);
		a = 10;
		System.out.println(a);
		a = a ^ 3;
		System.out.println(a);
		a >>= 3;
		System.out.println(a);
		a <<= 3;
		System.out.println(a);
	}
}