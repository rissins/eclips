package Example;
import java.util.Scanner;

public class Example2_7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("점(x,y)의 좌표를 입력하시오>> ");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int xMin = 100;
		int xMax = 200;
		int yMin = 100;
		int yMax = 200;
		if (((x >= xMin) && (x <= xMax)) && ((y >= yMin) && y <= yMax)) {
			System.out.println("("+ x +", "+ y + ")는 사각형 안에 있습니다.");
		}else {
			System.out.println("("+ x +", "+ y + ")는 사각형 안에 없습니다.");
		}
		
		scanner.close();
	}
}
