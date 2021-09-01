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
			result = "봄";
			break;
			
		case 6: case 7: case 8:
			result = "여름";
			break;
		case 9: case 10: case 11:
			result = "가을";
			break;
		case 12: case 1: case 2:
			result = "겨울";
			break;	

//	
//		
//		if (3 <= month || month <= 5) {
//			result = "봄";
//		} else if (6 <= month || month <=8) {
//			result = "여름";
//		} else if (9 <= month || month <=11) {
//			result = "가을";
//		} else if (12 <= month || month <=2) {
//			result = "겨울";
//		}
		
		
			
		}
		return result;
	}
}
