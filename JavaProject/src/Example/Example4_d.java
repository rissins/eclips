package Example;
import java.util.Scanner;

public class Example4_d {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� �ݾ��� �Է��ϼ���: ");
		
		int purchaseAmount = scanner.nextInt();
		int balance;
		
		if(purchaseAmount >= 300000) {
			balance = purchaseAmount - 30000;
			System.out.println("���� �ݾ� = "+purchaseAmount);
			System.out.println("û�� �ݾ� = "+balance);
		}else if ( 100000 <= purchaseAmount && purchaseAmount < 300000) {
			balance = purchaseAmount - 5000;
			System.out.println("���� �ݾ� = "+purchaseAmount);
			System.out.println("û�� �ݾ� = "+balance);
		}else {
			System.out.println("���� �ݾ� = "+purchaseAmount);
			System.out.println("û�� �ݾ� = "+purchaseAmount);
		}	
		scanner.close();
	}
}	
	
