package chap8;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
	public static void main(String[] args) {
		int siz = 0;
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> array = new ArrayList<String>();
		
		for (int i = 0; i < 4; i++) {
			System.out.println("�̸��� �Է��ϼ���>> ");
			String s = scanner.next();
			array.add(s);
			
		}
		
		
		for (int i = 0; i < array.size(); i++) {
			String str = array.get(i);
			System.out.print(str+" ");	
			
			if(array.get(siz).length() < array.get(i).length()) {
				siz = i;
			}
		}
		System.out.println("\n���� ���̸��� "+ array.get(siz));
	}
}
