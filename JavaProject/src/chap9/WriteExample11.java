package chap9;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample11 {
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("d:/output2.txt");
		char[] data = "ȫ�浿".toCharArray();
		
		for (int i = 0; i < data.length; i++) {
			writer.write(data[i]);
		}
		
		writer.close();
	}
}
