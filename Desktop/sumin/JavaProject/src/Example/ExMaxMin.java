package Example;

import java.util.Scanner;

public class ExMaxMin {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 3개 입력>> ");
		
		int num = scanner.nextInt();
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		int max=0;
		int min=0;
		if(num > num1 && num > num2) {
			max = num;
			if(num1 > num2) {
				
				min = num2;
			}else {
			
				min = num1;
			}
		}
		if(num1 > num && num1 > num2) {
			max = num1;
			if(num > num2) {
				
				min = num2;
			}else {
				
				min = num;
			}
		}
		if(num2 > num && num2 > num1) {
			max = num2;
			if(num > num1) {
				
				min = num1;
			}else {
				
				min = num;
			}
		}
		
		scanner.close();
		
		System.out.println("최대값은 "+ max);
		System.out.println("최소값은" + min);
		
	}
}
