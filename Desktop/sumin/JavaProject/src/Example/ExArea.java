package Example;
import java.util.Scanner;

public class ExArea {
	public static void main(String[] args) {
		
		float area = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�>> ");
		int upperLength = scanner.nextInt();
		int underLength = scanner.nextInt();
		int height = scanner.nextInt();
		
		if(height == 0) {
			area = upperLength * underLength / 2;
			System.out.println("�ﰢ���� ���̴� "  + area);	
		}
		else {
			area = (upperLength + underLength) * height / 2;
			System.out.println("��ٸ����� ���̴� " + area);
		}
		
		scanner.close();
	}
}


