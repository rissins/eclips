package Example;
import java.util.Scanner;

public class Example2_7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("��(x,y)�� ��ǥ�� �Է��Ͻÿ�>> ");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int xMin = 100;
		int xMax = 200;
		int yMin = 100;
		int yMax = 200;
		if (((x >= xMin) && (x <= xMax)) && ((y >= yMin) && y <= yMax)) {
			System.out.println("("+ x +", "+ y + ")�� �簢�� �ȿ� �ֽ��ϴ�.");
		}else {
			System.out.println("("+ x +", "+ y + ")�� �簢�� �ȿ� �����ϴ�.");
		}
		
		scanner.close();
	}
}
