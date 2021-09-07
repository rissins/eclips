package question;

public class Asterisk {
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public String process(int number) {
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = number; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				stringBuffer.append("*");
			}
			stringBuffer.append("<br>");
		}
		
		return stringBuffer.toString();
	}
}
