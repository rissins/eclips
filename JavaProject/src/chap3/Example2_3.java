package chap3;

import java.util.Scanner;

public class Example2_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�ݾ��� �Է��Ͻÿ�>> ");
		int money = scanner.nextInt();
		
		int oman = money / 50000;
		int man = money % 50000 / 10000;
		int chun = money % 50000 % 10000 / 1000;
		int baek = money % 50000 % 10000 % 1000 / 100;
		int osip = money % 50000 % 10000 % 1000 % 100 / 50;
		int ten = money % 50000 % 10000 % 1000 % 100 % 50 / 10;
		int one = money % 50000 % 10000 % 1000 % 100 % 10;
		System.out.println("�������� "+oman+"��");
		System.out.println("������ "+man+"��");
		System.out.println("õ���� "+chun+"��");
		System.out.println("����� "+baek+"��");
		System.out.println("���ʿ��� "+osip+"��");
		System.out.println("�ʿ��� "+ten+"��");
		System.out.println("�Ͽ��� "+one+"��");
	}
}
