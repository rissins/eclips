package Example;

import java.util.Scanner;

public class ArrayMinMax {
	public static void main(String[] args) {
		int intArray[] = new int[10];
		int max = 0;
		int min = Integer.MAX_VALUE;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("��� 10���� �Է��ϼ���.");
		
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
		
		System.out.println("���� ���� ���� "+min);
		System.out.println("���� ū ���� "+max);
		System.out.println("���� �� + ū ���� "+min+max);
		
	}
}
