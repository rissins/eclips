package Example;
import java.util.Scanner;

public class ExCalculation {
	public static void main(String[] args) {
		double sum = 0;
		double minus = 0;
		double times = 0;
		double divi = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("2°³ÀÇ ½Ç¼ö ÀÔ·Â>> ");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		sum = num1 + num2;
		times = num1 * num2;
		minus = num1 - num2;
		divi = num1 / num2;
		
		System.out.printf("µÎ¼öÀÇ µ¡¼ÀÀº %.1f \n", sum);
		System.out.printf("µÎ¼öÀÇ »¬¼ÀÀº %.1f \n", minus);
		System.out.printf("µÎ¼öÀÇ °ö¼ÀÀº %.1f \n", times);
		System.out.printf("µÎ¼öÀÇ ³ª´°¼ÀÀº %.1f", divi);

		scan.close();
	}
}
