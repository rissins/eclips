package Example;

import java.util.Scanner;

public class ArrayMinMax {
	public static void main(String[] args) {
		int intArray[] = new int[10];
		int max = 0;
		int min = Integer.MAX_VALUE;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("양수 10개를 입력하세요.");
		
		for (int i = 0; i < 10; i++) {
			intArray[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < intArray.length; i++) {
			if( max > intArray[i] ) {
				max = intArray[i];
			}
			if (min < intArray[i]) {
				min = intArray[i];
			}
		}
		
		System.out.println("가장 작은 수는 "+min);
		System.out.println("가장 큰 수는 "+max);
		System.out.println("작은 수 + 큰 수느 "+min+max);
		
	}
}
