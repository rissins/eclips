package chap4;

import java.util.Scanner;

public class guessNumber {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int numberToGuess;
		int guess;
		
		numberToGuess = (int)(Math.random()*10)+1;
		
		while(true) {
		System.out.print("������ ���ڸ� �Է��ϼ���: ");
		guess = scanner.nextInt();
			if(guess == numberToGuess) {
				System.out.println("���߼̽��ϴ�.");
				break;
			}else if(guess > numberToGuess) {
				System.out.println("������ ���ڰ� �ʹ� Ů�ϴ�.");
			}else if(guess < numberToGuess) {
				System.out.println("������ ���ڰ� �ʹ� �۽��ϴ�.");
			}
		}
		
		scanner.close();

	}
}	
