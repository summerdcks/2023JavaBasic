package Lecture;

import java.util.Arrays;
import java.util.Collections;

public class SortFunction {
//배열의 정렬(오름차순, 내림차순)
	public static void main(String[] args) {
		String[] temp = {"lee", "kim", "john", "bill", "mike"};
		Arrays.sort(temp);
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);			//오름차순abc
		}
		System.out.println("====================");
		Arrays.sort(temp, Collections.reverseOrder());	//내림차순cba
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
	}
}

//First in, Last out