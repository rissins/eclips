package chap9;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class ReadExample12 {
	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("d:/test2.txt");
		int readCharNo;
		char[] cbuf = new char[2];
		String data="";
		
		while(true) {
			readCharNo = reader.read(cbuf); 
			
			if(readCharNo == -1) {
				break;
			}
			
			data += new String(cbuf, 0, readCharNo);
		}
		System.out.println(data);
		
		reader.close();
			
	}
}
