package Example;

import java.util.Scanner;

public class Example2_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int home;
		int one = 1200;
		int ten;
		System.out.print("�������� �Է��Ͻÿ�>> ");
		home = scanner.nextInt();
		
		int support = 200000 + (200000 * home);
		int dollor = support / one ;
		int res = dollor / 100;
		ten = dollor % 100 / 10;
		if(ten > 0) {
//			ten = dollor % 100 / 10;
			System.out.println("100�޷�¥�� "+res+"��");
			System.out.println("10�޷�¥�� "+ten+"��");			
		}else if(ten == 0) {
			System.out.println("100�޷�¥�� "+res+"��");
		}
	}
}
