package Example;
import java.util.Scanner;

public class Tesla {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int teslaStock = 520;
		System.out.print("매수 수량을 입력하시오>> ");
		int num = scanner.nextInt();
		
		int dollor = teslaStock * num;
		
		int hund = dollor / 100;
		int ten = dollor % 100 / 10;
		
		System.out.println("100달러짜리: "+hund+"매");
		System.out.println("10달러짜리: "+ten+"매");
		
	}
}
