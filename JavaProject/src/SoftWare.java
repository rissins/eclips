import java.util.Scanner;

public class SoftWare {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		final String password = "myongji60";
	
		int tryNumber = 0;

		
		do {
			System.out.print("��ȣ�� �Է��ϼ���: ");
			String input = scanner.next();
			tryNumber = tryNumber + 1;
			if(!input.equals(password)) {
				if(tryNumber == 3) {
					System.out.println("������ �ź��մϴ�.");
					break;
				}else {
					System.out.println("��ȣ�� Ʋ���ϴ�.");
				}
			}else {
				System.out.println("ȯ���մϴ�.");
				break;
			
		}
		
		}
			
		while(true);
		
		scanner.close();
		
	}
}