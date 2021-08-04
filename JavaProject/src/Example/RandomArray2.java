package Example;

import java.util.Scanner;

public class RandomArray2 {
	public static void main(String[] args) {
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 몇개? ");
		int put = scanner.nextInt();
		int intArray[] = new int[put];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = (int)(Math.random()*100)+1;	
			for (int j = 0; j < i; j++) {
				if(intArray[i] == intArray[j]) {
					i--;
				}
			}
		}
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i]+"\t");
			count++;
			if (count % 10 == 0 ) {
				System.out.println();
			}
		}
		
		scanner.close();
	}
	
	
}

