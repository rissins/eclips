package Example;
import java.util.Scanner;

public class Example2_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int times = 0;
		System.out.print("2���� ���� �Է�>> ");
		int num = scan.nextInt();
		int num1 = scan.nextInt();
		
		sum = num + num1;
		times = num * num1;
		
		System.out.println("�� ���� ���� "+ sum);
		System.out.println("�� ���� ���� "+ times);
		
		scan.close();
	}
	
	
}
