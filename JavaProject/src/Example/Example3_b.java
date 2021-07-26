package Example;
import java.util.Scanner;
public class Example3_b {
	public static void main(String[] args) {
		int money = 0;
		int sum = 0;
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		
		while (count < 10) {
			System.out.print("요금을 입력하세요: ");
			money = scanner.nextInt();
			sum = money + sum;
			count++;
		}
		
		System.out.println("총 수입: " + sum);
	}
}
