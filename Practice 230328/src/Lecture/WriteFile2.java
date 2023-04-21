package Lecture;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile2 {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\DataSWB\\Desktop\\out.txt", true);
		for (int i = 11; i < 16; i++) {
			String data = "Line #" + i + "\n";
			fw.write(data);
		}
		fw.close();
	}

}
