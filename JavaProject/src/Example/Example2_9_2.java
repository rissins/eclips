package Example;
import java.util.Scanner;

public class Example2_9_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("����>> ");
		int num = scanner.nextInt();
		String cal = scanner.next();
		int num2 = scanner.nextInt();
		
		switch(cal) {
		
		case "+":
			int sum = num + num2;
			System.out.println(num + cal + num2 +"�� ��� ����� "+ sum);
			break;
		case "-":
			int minus = num - num2;
			System.out.println(num + cal + num2 +"�� ��� ����� "+ minus);
			break;
		case "*":
			int times = num * num2;
			System.out.println(num + cal + num2 +"�� ��� ����� "+ times);
			break;
		case "/":
			switch(num2) {
			case 0:
				System.out.println("0���� ���� �� �����ϴ�.");
			}
			int div = num / num2;
			System.out.println(num + cal + num2 +"�� ��� ����� "+ div);
			break;
		}
	}
}
