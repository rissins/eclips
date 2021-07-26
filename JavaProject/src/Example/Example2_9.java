package Example;
import java.util.Scanner;

public class Example2_9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("연산>> ");
		int num = scanner.nextInt();
		String cal = scanner.next();
		int num2 = scanner.nextInt();
		int b = 0;
		
		if(cal.equals("+")) {
			b = num + num2;
			System.out.println(num + cal + num2 +"의 계산 결과는 "+ b);
		}else if (cal.equals("-")) {
			b = num - num2;
			System.out.println(num + cal + num2 +"의 계산 결과는 "+ b);
		}else if (cal.equals("*")) {
			b = num * num2;
			System.out.println(num + cal + num2 +"의 계산 결과는 "+ b);
		}else if (cal.equals("/")) {
			b = num / num2;
			if (num == 0 || num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
			System.out.println(num + cal + num2 +"의 계산 결과는 "+ b);		
			}
		}	
		
		scanner.close();
	}	
}	
