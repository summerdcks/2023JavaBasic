package Lecture;

import java.io.File;

public class ListFiles {

	public static void main(String[] args) {
		File dir = new File("C:\\Users\\DataSWB\\Desktop");
		File files[] = dir.listFiles();
		
		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i]);
		}
	}
}
