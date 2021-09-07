package question;

public class Capital {

	private String string;

	public String getString() {
		return string;
	}
	public void setString(String string) {
		this.string = string; 
	}
	
	public String process(String string) {
		StringBuffer stringBuffer = new StringBuffer();
		
		char c = 'A';
		char c2 =string.charAt(0);
		
		for (char i = c2; i >= c; i--) {
			for (char j = c; j <= i; j++) {
				stringBuffer.append(j);
			}
			stringBuffer.append("<br>");
		}
		
		return stringBuffer.toString();
	}
}
