package Example;
import java.util.Scanner;

public class ExStock1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�ڽ��� ������ �Է��ϼ���(1800~2500): ");
		int kospi = scanner.nextInt();
		System.out.print("ȯ���� �Է��ϼ���(1100~1200): ");
		int exchangeRate = scanner.nextInt();
		
		if (exchangeRate >= 1150) {
			if (kospi >= 2200) {
				System.out.println("�����");
			}else if (2000 <= kospi && kospi <= 2199) {
				System.out.println("Ⱦ����");
			
			}
		}else  {
			if (kospi >= 2300) {
				System.out.println("�����");
			}else if (2000 <= kospi && kospi <= 2299) {
				System.out.println("Ⱦ����");
			}else {
				System.out.println("�϶���");
			}
		}
		
		scanner.close();
	}
}
