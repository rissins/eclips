package chap4;

import java.util.Scanner;

class CurrencyConverter{
	private static double rate;
	public static double toDollor(double won) {
		return won/rate;
	}
	public static double toKWR(double dollor) {
		return dollor * rate;
	}
	public static void setRate(double r) {
		rate = r;
	}
}
public class StaticMember {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("환율(달러)>> ");
		double rate = scanner.nextDouble();
		CurrencyConverter.setRate(rate);
		System.out.println("백만원은 $"+ CurrencyConverter.toDollor(1000000)+"입니다.");
		System.out.println("$100은"+ CurrencyConverter.toKWR(100)+ "원입니다.");
		scanner.close();
	}
}
