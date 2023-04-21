package Assignment0324;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ch4A11 {
// 1km/h == 0.278m/s == 278m/ms
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		double c = scanner.nextDouble();
		//단위 km/h로 변환
		double numa = a / 0.278;
		double numb = b;
		double numc = c / 0.000278;
		//리스트에 넣기
		List<Double> list = new ArrayList<Double>();
		list.add(numa);
		list.add(numb);
		list.add(numc);
		//오름차순 정렬
		Collections.sort(list);			
		if (list.get(2) == numa) {
			System.out.println(a + "m/s");
		} else if (list.get(2) == numb) {
			System.out.println(b + "km/h");
		} else if (list.get(2) == numc) {
			System.out.println(c + "m/ms");
		}
	}
}
