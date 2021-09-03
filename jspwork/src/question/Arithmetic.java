package question;

public class Arithmetic {
	private int number1;
	private int number2;
	private char answer;
	public int getNumber1() {
		return number1;
	}
	public void setNumber1(int number1) {
		this.number1 = number1;
	}
	public int getNumber2() {
		return number2;
	}
	public void setNumber2(int number2) {
		this.number2 = number2;
	}
	public char getAnswer() {
		return answer;
	}
	public void setAnswer(char answer) {
		this.answer = answer;
	}
	
	public int Process(int numebr1, char answer, int number2) {
		int result = 0;
		
		switch (answer) {
		case '+':
			result = number1+number2;
			break;
		case '-':
			result = number1-number2;
			break;
		case '*':
			result = number1*number2;
			break;
		case '/':
			result = number1/number2;
			break;
		}
		return result;
	}
}
