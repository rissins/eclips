package Example;
import java.util.Scanner;

public class Example2_6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("10~99 사이의 정수를 입력하시오>>> ");
		int num = scanner.nextInt();
		int count = 0;
		if(num % 10 == 3 || num % 10 == 6 || num % 10 == 9 ) {
			count++;
//			System.out.println("박수짝");
		}if(num / 10 == 3 || num / 10 == 6 || num / 10 == 9 ) {
			count++;
//			System.out.println("박수짝");
		}
		if(count == 1) {
			System.out.println("박수짝");
		} else if (count == 2) {
			System.out.println("박수짝짝");
		}
		
		scanner.close();
	}
}
