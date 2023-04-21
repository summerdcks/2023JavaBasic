package Lecture;

import java.util.Arrays;
import java.util.Collections;

public class ch5P8Sort {

	public static void main(String[] args) {
		Integer[] temp = {2, 33, 7, 5, 12, 34, 99, 25, 28, 53, 20};

		Arrays.sort(temp);					//오름차순abc
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);			
		}
		System.out.println("====================");
		Arrays.sort(temp, Collections.reverseOrder());		//내림차순cba
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
	
		// TODO Auto-generated method stub

	}

}
