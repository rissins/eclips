package Example;
import java.util.Scanner;

public class Example4_b {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean cheating;
		int attendrate;
		int totalscore = 0;
		String grade;
		
		System.out.print("부정행위의 여부를 입력하세요(true or false): ");
		cheating = scanner.nextBoolean();
		
		System.out.print("출석률(0~100): ");
		attendrate = scanner.nextInt();
		
		System.out.print("총점(0~100): ");
		totalscore = scanner.nextInt();
		
		if(cheating == true || attendrate < 80 ) {
			grade = "F";
		}else {
			if(totalscore >= 90) {
				grade = "A";
			}else if(totalscore >= 80) {
				grade = "B";
			}else if(totalscore >= 70) {
				grade = "C";
			}else if(totalscore >= 60) {
				grade = "D";
			}else {
				grade = "F";
			}
		}
		scanner.close();
		
		System.out.println("학점은 "+grade);
	}
}
