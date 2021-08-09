package chap6;

public class AutoBoxingUnBoxingEx {
	public static void main(String[] args) {
		int n = 10;
//		Integer intObject = Integer.valueOf(n);
		Integer intObject = n;
		System.out.println("intObject = "+intObject);
		
		int m = intObject.intValue() +10;
		System.out.println("m = "+m);
	}
}
