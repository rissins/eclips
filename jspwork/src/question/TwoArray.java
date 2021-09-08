package question;

public class TwoArray {
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public String process(int number) {
		int[] intArray = new int[number*number];
		StringBuffer stringBuffer = new StringBuffer();
		
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = (int)(Math.random()*10+1);
		
			
		}
		for (int i = 0; i < intArray.length; i++) {
			stringBuffer.append(intArray[i]+"  ");
			
			if ((i+1) % 4 == 0 && i != 0) {
				stringBuffer.append("<br>");
			}
		}
		
		return stringBuffer.toString();
	}
}
