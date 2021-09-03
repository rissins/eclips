package question;

public class Multiple {
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public String process(int number) {
		boolean multiple = false;
		StringBuffer strBuffer = new StringBuffer();
		String result = "";
		
		
		if (number % 8 == 0) {
			result += "8의 배수이다.<br>";
		}
		if (number % 5 == 0) {
			result += "5의 배수이다.<br>";
		}
		if (number % 3 == 0) {
			result += "3의 배수이다.";
		}
		
		return result;
		
		
		
	}
}
