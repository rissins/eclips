package Example;
import java.util.Scanner;

public class Multiple {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;
		boolean multiple = false;
		
		System.out.print("���� ������ �Է��ϼ���: ");
		number = scanner.nextInt();
		
		if(number % 3 == 0) {
			multiple = true;
			System.out.println("3�� ����̴�.");
		}	
		if(number % 5 == 0 ) {
			multiple = true;
			System.out.println("5�� ����̴�.");
		}
		if(number % 8 == 0) {
			multiple = true;
			System.out.println("8�� ����̴�.");
		}
		if(!multiple) {
			System.out.println("��� ����� �ƴϴ�");
		}
	}
}
