package question;

public class DivAndRemains {
	private int number;

	
	
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public String Process(int number) {
		String result;
		if (number / 10 == number % 10) {
			result = "같습니다.";
		}else {
			result = "다릅니다.";
		}
		return result;
	}
}
