package Example;
import java.util.Scanner;
public class Example2_5_0726 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int num = scanner.nextInt();
		
		int hour = num / 60 / 60; 
		int min = num / 60 % 60;
		int sec = num % 60;
		
		System.out.println(num+"초는 "+hour+"시간, "+min+"분, "+sec+"초입니다.");
	}
}
