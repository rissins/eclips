package Example;
import java.util.Scanner;

public class Example2_1 {
	public static void main(String[] args) {
		final double rate = 1100.0;
		Scanner scan = new Scanner(System.in);
		System.out.print("��ȭ�� �Է��ϼ���(���� ��)>> ");
		int won = scan.nextInt();
		double dollar = won/rate;
		System.out.println(won + "���� $" + dollar + "�Դϴ�.");
		scan.close();
	}
}
