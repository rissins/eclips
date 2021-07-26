package Example;
import java.util.Scanner;

public class Example2_9_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("연산>> ");
		int num = scanner.nextInt();
		String cal = scanner.next();
		int num2 = scanner.nextInt();
		
		switch(cal) {
		
		case "+":
			int sum = num + num2;
			System.out.println(num + cal + num2 +"의 계산 결과는 "+ sum);
			break;
		case "-":
			int minus = num - num2;
			System.out.println(num + cal + num2 +"의 계산 결과는 "+ minus);
			break;
		case "*":
			int times = num * num2;
			System.out.println(num + cal + num2 +"의 계산 결과는 "+ times);
			break;
		case "/":
			switch(num2) {
			case 0:
				System.out.println("0으로 나눌 수 없습니다.");
			}
			int div = num / num2;
			System.out.println(num + cal + num2 +"의 계산 결과는 "+ div);
			break;
		}
	}
}
