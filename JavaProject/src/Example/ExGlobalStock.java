package Example;
import java.util.Scanner;

public class ExGlobalStock {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�ż��ݾ��� �Է��ϼ���: ");
		int buy = scanner.nextInt();
		System.out.print("�ŵ��ݾ��� �Է��ϼ���: ");
		int sell = scanner.nextInt();
		int tex;
		
		if(buy < sell) {
			tex = (int) ((sell - buy) * 0.22);
		}else {
			tex = 0;
		}
	
		scanner.close();
		System.out.println("�絵�� = "+tex);
	}
} 