import java.util.Scanner;

public class CircularCone {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("원뿔 밑의 원의 반지름을 입력하세요: ");
		float radius = scanner.nextInt();
		System.out.print("원뿔의 높이를 입력하세요: ");
		float height = scanner.nextInt();
		double volume = (Math.PI * radius * radius * height) / 3;
		
		System.out.println("원뿔 밑의 원의 반지름: "+ radius);
		System.out.println("원뿔의 높이: " +height);
		System.out.printf("원뿔의 부피: "+ volume);
	}
}
