package Example;

import java.util.Scanner;

public class AreaCircle {
	public static void main(String[] args) {
		
		double b = 0;
		
		Scanner put = new Scanner(System.in);
		
		System.out.print("�������� �Է��ϼ���: ");
		int a = put.nextInt();
		
		b = Math.PI * a * a;
		System.out.printf("���� ������ %.2f �Դϴ�.", b);
		put.close();
		
		
	}
}
