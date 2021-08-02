package chap4;

import java.util.Scanner;

public class guessNumber {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int numberToGuess;
		int guess;
		
		numberToGuess = (int)(Math.random()*10)+1;
		
		while(true) {
		System.out.print("추측한 숫자를 입력하세요: ");
		guess = scanner.nextInt();
			if(guess == numberToGuess) {
				System.out.println("맞추셨습니다.");
				break;
			}else if(guess > numberToGuess) {
				System.out.println("추측한 숫자가 너무 큽니다.");
			}else if(guess < numberToGuess) {
				System.out.println("추측한 숫자가 너무 작습니다.");
			}
		}
		
		scanner.close();

	}
}	
