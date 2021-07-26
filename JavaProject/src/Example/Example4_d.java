package Example;
import java.util.Scanner;

public class Example4_d {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("구매 금액을 입력하세요: ");
		
		int purchaseAmount = scanner.nextInt();
		int balance;
		
		if(purchaseAmount >= 300000) {
			balance = purchaseAmount - 30000;
			System.out.println("구매 금액 = "+purchaseAmount);
			System.out.println("청구 금액 = "+balance);
		}else if ( 100000 <= purchaseAmount && purchaseAmount < 300000) {
			balance = purchaseAmount - 5000;
			System.out.println("구매 금액 = "+purchaseAmount);
			System.out.println("청구 금액 = "+balance);
		}else {
			System.out.println("구매 금액 = "+purchaseAmount);
			System.out.println("청구 금액 = "+purchaseAmount);
		}	
		scanner.close();
	}
}	
	
