package Example;
import java.util.Scanner;

public class Example2_6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("10~99 ������ ������ �Է��Ͻÿ�>>> ");
		int num = scanner.nextInt();
		int count = 0;
		if(num % 10 == 3 || num % 10 == 6 || num % 10 == 9 ) {
			count++;
//			System.out.println("�ڼ�¦");
		}if(num / 10 == 3 || num / 10 == 6 || num / 10 == 9 ) {
			count++;
//			System.out.println("�ڼ�¦");
		}
		if(count == 1) {
			System.out.println("�ڼ�¦");
		} else if (count == 2) {
			System.out.println("�ڼ�¦¦");
		}
		
		scanner.close();
	}
}
