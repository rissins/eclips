package Example;

import java.util.Scanner;

public class ArrayMin {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int intArray[] = new int[7];
		System.out.println("양수 7개를 입력하세요.");
	
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = (int)(Math.random()*100+1);
			System.out.print(intArray[i] + "   ");
				
		}
		
		int min = intArray[0];
		for (int i = 0; i < intArray.length; i++) {
			if(min > intArray[i]) {
				min = intArray[i];
			}

		}
		System.out.println();
		System.out.println(min);
		scanner.close();
		
	}
	
}
