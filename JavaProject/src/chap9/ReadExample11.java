package chap9;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class ReadExample11 {
	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("d:/test2.txt");
		int readData;
		
		while ((readData =reader.read()) != -1) {
			System.out.print((char)readData);
		}
		
//		while(true) {
//			readData = reader.read();
//			
//			if(readData == -1) {
//				break;
//			}
//			
//			System.out.print((char)readData);
//		}
		reader.close();
		
	}
}
