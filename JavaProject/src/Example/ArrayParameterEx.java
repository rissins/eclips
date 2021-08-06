package Example;

import java.util.Arrays;

public class ArrayParameterEx {
	void replaceBe(String[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i].equals("be")) {
				a[i] = "eat";
			}
		}
	}
	
	void printStringArray(String[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		String[] s = {"to", "be", "or", "not", "to", "be"};
		ArrayParameterEx AP = new ArrayParameterEx();
		AP.printStringArray(s);
		AP.replaceBe(s);
		AP.printStringArray(s);
	}
	
	
}
