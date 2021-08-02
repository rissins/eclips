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
		System.out.print("ȯ��(�޷�)>> ");
		double rate = scanner.nextDouble();
		CurrencyConverter.setRate(rate);
		System.out.println("�鸸���� $"+ CurrencyConverter.toDollor(1000000)+"�Դϴ�.");
		System.out.println("$100��"+ CurrencyConverter.toKWR(100)+ "���Դϴ�.");
		scanner.close();
	}
}
