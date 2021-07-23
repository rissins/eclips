package Example;
import java.util.Scanner;

public class Example2_1 {
	public static void main(String[] args) {
		final double rate = 1100.0;
		Scanner scan = new Scanner(System.in);
		System.out.print("원화를 입력하세요(단위 원)>> ");
		int won = scan.nextInt();
		double dollar = won/rate;
		System.out.println(won + "원은 $" + dollar + "입니다.");
		scan.close();
	}
}
