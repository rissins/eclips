import java.util.Scanner;

public class CircularCone {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� ���� ���� �������� �Է��ϼ���: ");
		float radius = scanner.nextInt();
		System.out.print("������ ���̸� �Է��ϼ���: ");
		float height = scanner.nextInt();
		double volume = (Math.PI * radius * radius * height) / 3;
		
		System.out.println("���� ���� ���� ������: "+ radius);
		System.out.println("������ ����: " +height);
		System.out.printf("������ ����: "+ volume);
	}
}
