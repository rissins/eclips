package Example;
import java.util.Scanner;

public class Example2_5 {
	public static void main(String[] args) {
		
		int sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� 3���� �Է��Ͻÿ�>> ");
		int num = scanner.nextInt();
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		if(num2 > num1 && num2 > num) {
			sum = num1 + num;
			if(num2 < sum) {
				System.out.println("�ﰢ���� �˴ϴ�.");
			}
			else
				System.out.println("�ﰢ���� �Ұ����մϴ�.");
		}
		if(num1 > num && num1 > num2) {
			sum = num + num2;
			if(num1 < sum) {
				System.out.println("�ﰢ���� �˴ϴ�.");
			}
			else
				System.out.println("�ﰢ���� �Ұ����մϴ�.");
		}
		if(num > num1 && num > num2) {
			sum = num1 + num2;
			if(num < sum) {
				System.out.println("�ﰢ���� �˴ϴ�.");
			}
			else
				System.out.println("�ﰢ���� �Ұ����մϴ�.");
		}
		
		scanner.close();
	}
}
