package Example;

import java.util.Scanner;

class Trapezoid {
	
	public void getArea(int down, int up, int height) {
		float area;
		area = (down + up) * height / 2;
		
		System.out.println("��ٸ��� ������ " + area);
	}
	
}

public class Example4_2_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�Ʒ���, ����, ���� �Է� >> ");
		int down = scanner.nextInt();
		int up = scanner.nextInt();
		int height = scanner.nextInt();
		Trapezoid area = new Trapezoid();
		area.getArea(down, up, height);
	}
}
