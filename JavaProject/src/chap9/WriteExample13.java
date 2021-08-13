package chap9;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample13 {
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("d:/output2.txt");
		char[] data = "юс©╣©У".toCharArray();
		
		writer.write(data, 1, 2);
		
		writer.close();
	}
}
