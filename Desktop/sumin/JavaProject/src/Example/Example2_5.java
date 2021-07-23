package Example;
import java.util.Scanner;

public class Example2_5 {
	public static void main(String[] args) {
		
		int sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 3개를 입력하시오>> ");
		int num = scanner.nextInt();
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		if(num2 > num1 && num2 > num) {
			sum = num1 + num;
			if(num2 < sum) {
				System.out.println("삼각형이 됩니다.");
			}
			else
				System.out.println("삼각형이 불가능합니다.");
		}
		if(num1 > num && num1 > num2) {
			sum = num + num2;
			if(num1 < sum) {
				System.out.println("삼각형이 됩니다.");
			}
			else
				System.out.println("삼각형이 불가능합니다.");
		}
		if(num > num1 && num > num2) {
			sum = num1 + num2;
			if(num < sum) {
				System.out.println("삼각형이 됩니다.");
			}
			else
				System.out.println("삼각형이 불가능합니다.");
		}
		
		scanner.close();
	}
}
