package Example;

import java.util.Scanner;

public class AreaCircle {
	public static void main(String[] args) {
		
		double b = 0;
		
		Scanner put = new Scanner(System.in);
		
		System.out.print("반지름을 입력하세요: ");
		int a = put.nextInt();
		
		b = Math.PI * a * a;
		System.out.printf("원의 면적은 %.2f 입니다.", b);
		put.close();
		
		
	}
}
