package question;

public class EvenNumber {
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public int process(int number) {
		int result = 0;
		for (int i = 1; i <= number; i++) {
			if (i % 2 == 0) {
				result = result + i;
			}	
		}
		return result;	
	}
	
}
