package question;

public class Triangle {
	private int number1;
	private int number2;
	private int number3;
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
	public int getNumber3() {
		return number3;
	}
	public void setNumber3(int number3) {
		this.number3 = number3;
	}
	
	public String process(int number1, int number2, int number3) {
		String result = "";
		if (number1 > number2 && number1 > number3) {
			if (number1 > number2+number3) {
				result = "안됩니다.";
			}else {
				result = "됩니다.";
			}
		}
		if (number2 > number1 && number2 > number3) {
			if (number2 > number1+number3) {
				result = "안됩니다.";
			}else {
				result = "됩니다.";
			}
		}
		if (number3 > number1 && number3 > number2) {
			if (number3 > number1+number2) {
				result = "안됩니다.";
			}else {
				result = "됩니다.";
			}
		}
		
		return result;
	}
}
