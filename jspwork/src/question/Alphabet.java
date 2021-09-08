package question;

public class Alphabet {
	private String str;

	

	public String getStr() {
		return str;
	}



	public void setStr(String str) {
		this.str = str;
	}



	public String process(String str) {
		StringBuffer stringBuffer = new StringBuffer();
		char c = 'a';
		char c2 =str.charAt(0);
		
		do {
			stringBuffer.append(c);
			c = (char)(c+1);
		} while (c <= c2);
		
		return stringBuffer.toString();
	}
}
