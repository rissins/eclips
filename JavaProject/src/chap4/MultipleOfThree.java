package chap4;

import java.util.Scanner;

public class MultipleOfThree {
	public static void main(String[] args) {
		int[] num = new int[10];
		Scanner scanner = new Scanner(System.in);
	
		System.out.print("���� ���� 10���� �Է��Ͻÿ�>> ");
		
		
		
		for (int i = 0 ; i < num.length ; i++) {
			num[i] = scanner.nextInt();	
		}
		
		System.out.print("3�� ����� ");
		
		for (int i = 0; i < num.length; i++) {
			if(num[i] % 3 == 0){
				System.out.print(num[i] + "  ");
			}
		}
		
		scanner.close();
		
	}	
}
