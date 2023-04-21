package Lecture;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile2 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\DataSWB\\Desktop\\out.txt"));
		String line;
		while ((line = reader.readLine()) != null) {
			System.out.println(line);
		}
	}
}
