package question;

import java.util.ArrayList;
import java.util.List;

public class Array2 {
	private int number1;
	private int number2;
	private int number3;
	private int number4;
	private int number5;

	public int getNumber1() {
		return number1;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public int getNumber2() {
		return number2;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}

	public int getNumber3() {
		return number3;
	}

	public void setNumber3(int number3) {
		this.number3 = number3;
	}

	public int getNumber4() {
		return number4;
	}

	public void setNumber4(int number4) {
		this.number4 = number4;
	}

	public int getNumber5() {
		return number5;
	}

	public void setNumber5(int number5) {
		this.number5 = number5;
	}

	public String process(int[] array) {
		StringBuffer stringBuffer = new StringBuffer();

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 3 == 0) {
				stringBuffer.append(array[i]+" ");
			}
		}
		return stringBuffer.toString();

	}
}
