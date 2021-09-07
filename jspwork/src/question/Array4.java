package question;

import java.util.ArrayList;
import java.util.List;

public class Array4 {
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
//	public static boolean exists(int a[], int from, int r) {
//		
//	}
	
	public String process(int number) {
		StringBuffer stringBuffer = new StringBuffer();
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < list.size(); i++) {
			list.add((int)(Math.random()*100+1));
			if (list.contains(list.get(i))) {
				i--;
			}
			list.add((int)(Math.random()*100+1));
		}
		
		for (int i = 0; i < list.size(); i++) {
			stringBuffer.append(list.get(i));
			
		}
		
		return stringBuffer.toString();
			
		}
		
		
}
