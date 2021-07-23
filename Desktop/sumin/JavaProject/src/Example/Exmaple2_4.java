package Example;
import java.util.Scanner;

public class Exmaple2_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 3개 입력>> ");
		int num = scanner.nextInt();
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		int median;
//		if(num > num1 && num > num2) {
//			if(num1 > num2) {
//				System.out.println(num1);
//			}
//			else {
//				System.out.println(num2);
//			}
//		}
//		if(num1 > num2 && num1 > num) {
//			if(num2 > num) {
//				System.out.println(num2);
//			}
//			else {
//				System.out.println(num);
//			}
//		}
//		if(num2 > num && num2 > num1) {
//			if(num > num1) {
//				System.out.println(num);
//			}
//			else {
//				System.out.println(num1);
//			}
//		}
		
		
		if((num>num1 && num<num2) || (num>num2 && num<num1)) {
			median = num;
		}else if ((num1>num2 && num1<num) || (num1>num && num1<num2)) {
			median = num1;
		}else {
			median = num2;
		}
		
		System.out.println("중간 값은 " + median);
		scanner.close();
		
	}
}
