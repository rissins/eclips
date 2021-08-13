package chap9;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample3 {
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("d:/output.txt");
		byte[] data = "DEF".getBytes();
	
		os.write(data, 1, 2);
		os.close();
	}
}
