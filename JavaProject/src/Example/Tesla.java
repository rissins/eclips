package Example;
import java.util.Scanner;

public class Tesla {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int teslaStock = 520;
		System.out.print("�ż� ������ �Է��Ͻÿ�>> ");
		int num = scanner.nextInt();
		
		int dollor = teslaStock * num;
		
		int hund = dollor / 100;
		int ten = dollor % 100 / 10;
		
		System.out.println("100�޷�¥��: "+hund+"��");
		System.out.println("10�޷�¥��: "+ten+"��");
		
	}
}
