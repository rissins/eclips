package Example;
import java.util.Scanner;

public class ExStock {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�ڽ��� ������ �Է��ϼ���(1800~2500): ");
		int kospi = scanner.nextInt();
		
		System.out.print("ȯ���� �Է��ϼ���(1100~1200): ");
		int exchangeRate = scanner.nextInt();
		
		if (kospi >= 2300) {
			System.out.println("�����");
			
	
		} else if (kospi <= 2299 && kospi >= 2000) {
			System.out.println("Ⱦ����");
			
			if (exchangeRate >= 1150) {
				if (kospi >= 2200) {
					System.out.println("�����");
				}else if (kospi <= 2199 && kospi >= 2000) {
					System.out.println("Ⱦ����");
				}
			}
		}else {
			System.out.println("�϶���");
		}
		
		scanner.close();
	}
}
