package example;
import java.util.*;
public class exx15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] computer = {"가위", "바위", "보"};
		String word;
		int num = 0;
		
		while (true) {
			
			System.out.println("가위바위보 입력: ");
			word = input.next();
			num = (int)(Math.random()*3);
			
			if (word.equals(computer[num])) {
				System.out.println("비겼습니다.");
			}
			else if(word.equals("가위")){
				if (computer[num].equals("바위")) {
					System.out.println("졌습니다.");	
				}
				else { 
					System.out.println("이겼습니다.");
			
				}
			}
			else if(word.equals("바위")){
				if (computer[num].equals("보")) {
					System.out.println("졌습니다.");	
				}
				else { 
					System.out.println("이겼습니다.");
			
				}
			}
			else if(word.equals("보")){
				if (computer[num].equals("가위")) {
					System.out.println("졌습니다.");	
				}
				else { 
					System.out.println("이겼습니다.");
			
				}
			}
			else if(word.equals("그만")) {
				break;
			}
			else {
				System.out.println("가위바위보 또는 그만을 입력하세요: ");
			}

	}

	}	
}


//입력받은 값이 가위를 내고 이기거 질때 computer num의 확인하는 방법    ㄷ벼미 ㅜㅕㅡ

//바위로 
//보로