package chap9;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample14 {
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("d:/output2.txt");
		String data = "안녕 자바 프로그램";
		writer.write(data, 3, 2);

		writer.close();
	}
}
