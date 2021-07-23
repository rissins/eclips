package Example;
import java.util.Scanner;

public class ExExchange {
	public static void main(String[] args) {
		final double dollarRate = 1200;
		final double euroRate = 1500;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("원화를 입력하세요(단위 원)>> ");
		int won = scanner.nextInt();
		
		double dollar = won / dollarRate;
		double euro = won / euroRate;
		
		System.out.println(won + "원은 $"+ dollar + "입니다.");
		System.out.println(won + "원은 E"+ euro + "입니다.");
		
		scanner.close();
	}
}

