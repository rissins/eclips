package chap9;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample1 {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("D:/text.txt");
		int readByte;
		
		
		while((readByte = is.read()) != -1) {
			System.out.print((char)readByte);
		}
		
//		while (true) {
//			readByte = is.read();
//			
//			// -1 EOF end of file
//			if(readByte == -1) {
//				break;
//			}
//			System.out.println((char)readByte);
//		}
		is.close();
				
	}

}
