package Lecture;

import java.io.File;

public class FileHandling {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\DataSWB\\Desktop\\out.txt");
		System.out.println(file.exists());
		if (file.exists()) {
			file.delete();
		}
		System.out.println(file.exists());
	}
}
