package Example;
import java.util.Scanner;

public class ExSumMultiply {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("3�ڸ� ���� �Է�(100~999)>> ");
		int num = scanner.nextInt();
		
		int hun = num / 100;
		int ten = num % 100 / 10;
		int one = num % 100 % 10;
		
		int sum = hun + ten;
		int multiply = ten * one;
		System.out.println("100�� �ڸ��� 10�� �ڸ��� ����: " + sum);
		System.out.println("10�� �ڸ��� 1�� �ڸ��� ����: " + multiply);
		
		scanner.close();
	}
}


