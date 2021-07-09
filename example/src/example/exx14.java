package example;
import java.util.*;
public class exx14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("주사위를 입력하시오: ");
		Scanner scan = new Scanner(System.in);
		
		String word;
		while (true) {
			System.out.println("주사위, 그만: ");
			word = scan.next();
			if(word.equals("주사위")) {
				System.out.println((int)(Math.random()*6+1));
			}
			else if ( word.equals("그만")){
				break;
			}
			else {
				System.out.println("주사위 또는 그만을 입력하세요.");
			}
		}
		System.out.println("반복이 종료됐습니다.");
	}

}



