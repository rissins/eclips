package Example;
import java.util.Scanner;

public class ExRectangle {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("����, ���� ���̸� �Է��ϼ���>> ");
		int length = scan.nextInt();
		int width = scan.nextInt();
		int area = length * width ;
		
		System.out.println("�簢���� ������ "+ area + "�Դϴ�.");
		
		scan.close();
		
	}
}	
