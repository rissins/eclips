package Array;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("양수 5개를 입력하세요.");
		
		int array[] = new int[5];
		
		array[0] = scanner.nextInt();
		array[1] = scanner.nextInt();
		array[2] = scanner.nextInt();
		array[3] = scanner.nextInt();
		array[4] = scanner.nextInt();
		
		int max = array[0];
		
		for (int i = 0; i < array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
			
		}
		System.out.println("최대값::" + max);
			
		 
	}
}
