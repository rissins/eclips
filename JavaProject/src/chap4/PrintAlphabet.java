package chap4;

import java.util.Scanner;

public class PrintAlphabet {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>> ");
	    String s = scanner.next();
	    char c = s.charAt(0); // abc 0 : a, 1 : b, 2 : c
	    
	    for (char i = c; i >= 'a'; i--) {
			for (char j = 'a'; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
	    }
	    
	    scanner.close();

	}
}