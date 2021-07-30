package chap3;

import java.util.Scanner;

public class InputException {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 3개를 입력하세요. ");
		int sum = 0, n = 0;
				
		for (int i = 0; i < 3; i++) {
			System.out.println(i + 1 + ">>");
			try {
				n = scanner.nextInt();
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("정수가 아닙니다");
			}
			sum += n;
		}
		System.out.println(sum);
		scanner.close();
	}
}
