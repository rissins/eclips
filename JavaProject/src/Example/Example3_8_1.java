package Example;

import java.util.Scanner;

public class Example3_8_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] intArray = new int[10];
		int sum = 0;
		System.out.print("10개의 정수를 입력하세요>> ");
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = scanner.nextInt();
			sum += intArray[i];
			
		}
		System.out.println("합계는 " +sum);
		scanner.close();
	}
	
}
