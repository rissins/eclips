package chap3;

import java.util.Scanner;

public class Example2_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("금액으 입력하시오>> ");
		int money = scanner.nextInt();
		
		int oman = money / 50000;
		int man = money % 50000 / 10000;
		int chun = money % 50000 % 10000 / 1000;
		int baek = money % 50000 % 10000 % 1000 / 100;
		int osip = money % 50000 % 10000 % 1000 % 100 / 50;
		int ten = money % 50000 % 10000 % 1000 % 100 % 50 / 10;
		int one = money % 50000 % 10000 % 1000 % 100 % 10;
		System.out.println("오만원권 "+oman+"매");
		System.out.println("만원권 "+man+"매");
		System.out.println("천원권 "+chun+"매");
		System.out.println("백원권 "+baek+"매");
		System.out.println("오십원권 "+osip+"매");
		System.out.println("십원권 "+ten+"매");
		System.out.println("일원권 "+one+"매");
	}
}
