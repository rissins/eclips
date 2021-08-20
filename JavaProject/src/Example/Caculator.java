package Example;

import java.util.Scanner;

class Add2{
	private int num1, num2;

	public void setA(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}	
	
	int calculate() {
		return num1 + num2;
	}
}
class Sub2{
	private int num1, num2;
	
	public void setA(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}	
	
	int calculate() {
		return num1 - num2;
	}
}
class Mul2{
	private int num1, num2;
	
	public void setA(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}	
	
	int calculate() {
		return num1 * num2;
	}
}
class Div2{
	private int num1, num2;
	
	public void setA(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}	
	
	int calculate() {
		return num1 / num2;
	}
}

public class Caculator {
	public static void main(String[] args) {
		Scanner SCANNER = new Scanner(System.in);
		System.out.println("두 정수와 연산자를 입력하시오>> ");
		int num1 = SCANNER.nextInt();
		int num2 = SCANNER.nextInt();
		char operator = SCANNER.next().charAt(0);
		
		switch (operator) {
		case '+':
			Add2 add = new Add2();
			add.setA(num1, num2);
			System.out.println(add.calculate());
			break;
		case '-':
			Sub2 sub = new Sub2();
			sub.setA(num1, num2);
			System.out.println(sub.calculate());
			break;
		case '*':
			Mul2 mul= new Mul2();
			mul.setA(num1, num2);
			System.out.println(mul.calculate());
			break;
		case '/':
			Div2 div = new Div2();
			div.setA(num1, num2);
			System.out.println(div.calculate());
			break;

		default:
			break;
		}
	}

}
