package Example;

import java.util.Scanner;

public class RandomArray {
	public static void main(String[] args) {
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 몇개? ");
		int put = scanner.nextInt();
		int intArray[] = new int[put];
		for (int i = 0; i < intArray.length; i++) {
			System.out.print((int)(Math.random()*100)+1+"  ");
			count++;
			if (count % 10 == 0 ) {
				System.out.println();
			}
		}
	}
	
	
}

