package Example;
import java.util.Scanner;

public class DivAndRemains {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("2자리수 정수 입력(10~99)>> ");
		int num = scanner.nextInt();
		int one = num % 10;
		int ten = num / 10;
		if (one == ten) {
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		} else {
			System.out.println("No! ");

		}
		
		scanner.close();
	}
}
