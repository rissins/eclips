package chap4;

public class RandomNumber {

	public static void main(String[] args) {
		int rNumber;
		
		
		
		
		while (true) {
			rNumber = (int)(Math.random()*10000)%10;
			System.out.println(rNumber);
			if(rNumber == 7) {
				System.out.println("종료합니다.");
				break;
		}
		
		
			
		}
	}
	
}
