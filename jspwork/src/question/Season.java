package question;

public class Season {
	private int month;
	private int result;
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}

	
	



	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public String Process(int month) {
		String result = null;
		
		switch (month) {
		case 3: case 4: case 5:
			result = "��";
			break;
			
		case 6: case 7: case 8:
			result = "����";
			break;
		case 9: case 10: case 11:
			result = "����";
			break;
		case 12: case 1: case 2:
			result = "�ܿ�";
			break;	

//	
//		
//		if (3 <= month || month <= 5) {
//			result = "��";
//		} else if (6 <= month || month <=8) {
//			result = "����";
//		} else if (9 <= month || month <=11) {
//			result = "����";
//		} else if (12 <= month || month <=2) {
//			result = "�ܿ�";
//		}
		
		
			
		}
		return result;
	}
}
