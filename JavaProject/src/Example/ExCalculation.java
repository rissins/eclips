package Example;
import java.util.Scanner;

public class ExCalculation {
	public static void main(String[] args) {
		double sum = 0;
		double minus = 0;
		double times = 0;
		double divi = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("2���� �Ǽ� �Է�>> ");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		sum = num1 + num2;
		times = num1 * num2;
		minus = num1 - num2;
		divi = num1 / num2;
		
		System.out.printf("�μ��� ������ %.1f \n", sum);
		System.out.printf("�μ��� ������ %.1f \n", minus);
		System.out.printf("�μ��� ������ %.1f \n", times);
		System.out.printf("�μ��� �������� %.1f", divi);

		scan.close();
	}
}
