package Example;
import java.util.Scanner;

public class ExRectangle {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("가로, 세로 길이를 입력하세요>> ");
		int length = scan.nextInt();
		int width = scan.nextInt();
		int area = length * width ;
		
		System.out.println("사각형의 면적은 "+ area + "입니다.");
		
		scan.close();
		
	}
}	
