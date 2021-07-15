import java.util.Scanner;
public class Nanugi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y ;
		Scanner input = new Scanner(System.in);
		System.out.print("나누어줄 값 2개를 입력하시오");
		x = input.nextInt();
		y = input.nextInt();
		
		try {
			int result = x/y;
		
		}catch (Exception e) {
			System.out.println("실패");
		}
		System.out.println("성공");
	}
	
}
