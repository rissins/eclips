package Example;
	
import java.util.Scanner;

public class ExIf {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���>> ");
		int score = scanner.nextInt();
		String grade = "";

		if (score >= 0 && score <= 100) { // ������ 0�̻� 100���� �϶��� ����������α׷��� ���� �մϴ�.
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
			System.out.println(score + "���� " + grade + "��� �Դϴ�.");
		}
		else { // 0�̸� �̰ų� 100�� �ʰ�������쿡�� "���� �����Դϴ�."�� ��� ���ݴϴ�.
			System.out.println("���� �����Դϴ�.");		
		}

	}

}