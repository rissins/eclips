import java.util.Scanner;

public class SoftWare {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		final String password = "myongji60";
	
		int tryNumber = 0;

		
		do {
			System.out.print("암호를 입력하세요: ");
			String input = scanner.next();
			tryNumber = tryNumber + 1;
			if(!input.equals(password)) {
				if(tryNumber == 3) {
					System.out.println("접속을 거부합니다.");
					break;
				}else {
					System.out.println("암호가 틀립니다.");
				}
			}else {
				System.out.println("환영합니다.");
				break;
			
		}
		
		}
			
		while(true);
		
		scanner.close();
		
	}
}