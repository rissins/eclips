package Example;
import java.util.Scanner;

public class ExSumMultiply {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("3자리 정수 입력(100~999)>> ");
		int num = scanner.nextInt();
		
		int hun = num / 100;
		int ten = num % 100 / 10;
		int one = num % 100 % 10;
		
		int sum = hun + ten;
		int multiply = ten * one;
		System.out.println("100의 자리와 10의 자리의 합은: " + sum);
		System.out.println("10의 자리와 1의 자리의 곱은: " + multiply);
		
		scanner.close();
	}
}


