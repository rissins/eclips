package Example;
import java.util.Scanner;

public class ExArea {
	public static void main(String[] args) {
		
		float area = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하시오>> ");
		int upperLength = scanner.nextInt();
		int underLength = scanner.nextInt();
		int height = scanner.nextInt();
		
		if(height == 0) {
			area = upperLength * underLength / 2;
			System.out.println("삼각형의 넓이는 "  + area);	
		}
		else {
			area = (upperLength + underLength) * height / 2;
			System.out.println("사다리꼴의 넓이는 " + area);
		}
		
		scanner.close();
	}
}


