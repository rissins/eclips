package Example;

import java.util.Scanner;

public class Example3_8_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] intArray = new int[10];
		int sum = 0;
		System.out.print("10���� ������ �Է��ϼ���>> ");
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = scanner.nextInt();
			sum += intArray[i];
			
		}
		System.out.println("�հ�� " +sum);
		scanner.close();
	}
	
}
