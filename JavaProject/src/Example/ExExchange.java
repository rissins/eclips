package Example;
import java.util.Scanner;

public class ExExchange {
	public static void main(String[] args) {
		final double dollarRate = 1200;
		final double euroRate = 1500;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("��ȭ�� �Է��ϼ���(���� ��)>> ");
		int won = scanner.nextInt();
		
		double dollar = won / dollarRate;
		double euro = won / euroRate;
		
		System.out.println(won + "���� $"+ dollar + "�Դϴ�.");
		System.out.println(won + "���� E"+ euro + "�Դϴ�.");
		
		scanner.close();
	}
}

