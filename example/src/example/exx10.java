package example;
import java.util.*;
public class exx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0;
		int aa = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하시오: ");
		number = scan.nextInt();
		while (true) {
			aa++;
			System.out.println(aa + "번째 반복중입니다.");
			System.out.print("숫자를 입력하세요: ");
			if (scan.nextInt() == 0)
				break;
		}
		System.out.println("반복이 끝났습니다.");
		

}
}
