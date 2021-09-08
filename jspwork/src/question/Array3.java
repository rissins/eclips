package question;

public class Array3 {
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String process(int number) {
		StringBuffer stringBuffer = new StringBuffer();

		for (int i = 1; i <= number; i++) {
			stringBuffer.append((int) (Math.random() * 99 + 1) + "  ");
			if (i % 10 == 0) {
				stringBuffer.append("<br>");
			}

		}

		return stringBuffer.toString();
	}
}
