package Example;
import java.util.Scanner;

public class Example2_8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� �Է��ϼ���(1~12)>> ");
		
		int month = scanner.nextInt();
		
		if (1<= month && month <= 3 ) {
			System.out.println("��");
		}else if ( 4 <= month && month <= 6){
			System.out.println("����");
		}else if (7 <= month && month <= 9) {
			System.out.println("����");
		}else {
			System.out.println("�ܿ�");
		}
		scanner.close();
	}	
	
}
