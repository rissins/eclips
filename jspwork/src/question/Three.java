package question;

public class Three {
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	
	
	public String Process(int number) {
		String check;
		if (number % 3 == 0) {
			check = "3�� ��� �Դϴ�.";
		}else
			check = "3�� ����� �ƴմϴ�.";
		return check;
	}
	

}
