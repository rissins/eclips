package Example;
import java.util.Scanner;

public class ExGlobalStock {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("매수금액을 입력하세요: ");
		int buy = scanner.nextInt();
		System.out.print("매도금액을 입력하세요: ");
		int sell = scanner.nextInt();
		int tex;
		
		if(buy < sell) {
			tex = (int) ((sell - buy) * 0.22);
		}else {
			tex = 0;
		}
	
		scanner.close();
		System.out.println("양도세 = "+tex);
	}
} 