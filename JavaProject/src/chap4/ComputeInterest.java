package chap4;

import java.util.Scanner;

public class ComputeInterest {
	public static void main(String[] args) {
		int principal;
		double rate;
		double balance;
		int years = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���: ");
		principal = scanner.nextInt();
		System.out.print("���̷��� �Է��ϼ���: ");
		rate = scanner.nextDouble();
		System.out.println("������\t������");
		balance = principal;
		while(true) {
			years = years + 1;
			balance = balance * (1.0 + rate / 100.0);
			System.out.println(years+"\t"+balance);
			if(balance > principal*2) {
				break;
			}	
			
			
		}
		System.out.println("�ʿ��� ������  = "+years);
		
		
	}
}
