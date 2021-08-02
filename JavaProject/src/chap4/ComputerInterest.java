package chap4;

import java.util.Scanner;

public class ComputerInterest {
	public static void main(String[] args) {
		int principal;
		double rate;
		double balance;
		int years = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("원금을 입력하세요: ");
		principal = scanner.nextInt();
		System.out.print("연이률을 입력하세요: ");
		rate = scanner.nextDouble();
		System.out.println("연도수         원리금");
		balance = principal;
		while(true) {
			years = years + 1;
			balance = balance * (1.0 + rate / 100.0);
			System.out.println(years+"       "+balance);
			if(balance > principal*2) {
				break;
			}	
			
			
		}
		System.out.println("필요한 연도수  = "+years);
		
		
	}
}
