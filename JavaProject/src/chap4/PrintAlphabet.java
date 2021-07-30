package chap4;

import java.util.Scanner;

public class PrintAlphabet {
	public static void main(String[] args) {
		
//		String sA[] = new String[5];
		String[] sA = {"a", "b", "c", "d", "e"};
		Scanner scanner = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오>> ");
	    String s = scanner.next();
	    
	    
	    if(s.equals("e")) {
		    for (int i = 0; i < sA.length; i++) {
				String a = sA[i];
				 System.out.print(a);
				 for (int j = 5; j < sA.length; j--) {
					sA[j]
				}
			}
	    
	   
	    }

	}
}