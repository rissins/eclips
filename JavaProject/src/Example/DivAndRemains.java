package Example;
import java.util.Scanner;

public class DivAndRemains {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("2�ڸ��� ���� �Է�(10~99)>> ");
		int num = scanner.nextInt();
		int one = num % 10;
		int ten = num / 10;
		if (one == ten) {
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		} else {
			System.out.println("No! ");

		}
		
		scanner.close();
	}
}
