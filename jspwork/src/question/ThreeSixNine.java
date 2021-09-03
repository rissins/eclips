package question;

public class ThreeSixNine {
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String process(int number) {
		String result;
		int count = 0;
		if (number % 10 == 3 || number % 10 == 6 || number % 10 == 9) {
			count++;
		}
		if (number / 10 == 3 || number / 10 == 6 || number / 10 == 9) {
			count++;
		}
		
		if (count == 1) {
			result = "¹Ú¼ö Â¦";
		}else if (count == 2) {
			result = "¹Ú¼ö Â¦Â¦";
		}else {
			result = "¹Ú¼ö ¾øÀ½";
		}
		
		return result;
	}
}
