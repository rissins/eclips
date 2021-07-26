package Example;
import java.util.Scanner;

public class Example2_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int times = 0;
		System.out.print("2개의 정수 입력>> ");
		int num = scan.nextInt();
		int num1 = scan.nextInt();
		
		sum = num + num1;
		times = num * num1;
		
		System.out.println("두 수의 합은 "+ sum);
		System.out.println("두 수의 곱은 "+ times);
		
		scan.close();
	}
	
	
}
