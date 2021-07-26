package Example;
	
import java.util.Scanner;

public class ExIf {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요>> ");
		int score = scanner.nextInt();
		String grade = "";

		if (score >= 0 && score <= 100) { // 점수가 0이상 100이하 일때만 성적출력프로그램을 실행 합니다.
			if ( score >= 90) {
				grade = "A";
			}
			else if (score >= 80) {
				grade = "B";
			}
			else if (score >= 70) {
				grade = "C";
			}
			else if (score >= 60) {
				grade = "D";
			}
			else {
				grade = "F";
			}
			System.out.println(score + "점은 " + grade + "등급 입니다.");
		}
		else { // 0미만 이거나 100을 초과했을경우에는 "점수 오류입니다."를 출력 해줍니다.
			System.out.println("점수 오류입니다.");		
		}

	}

}