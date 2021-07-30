package chap3;

public class NumException {
	public static void main(String[] args) {
//		String[] stringNumber = {"23", "12", "3.141592", "998");
		String[] stringNumber = {"23", "12", "998"};
		
		for (int i = 0; i < stringNumber.length; i++) {
			int j = Integer.parseInt(stringNumber[i]);
			System.out.println("숫자로 변환된 값은" + j);
		
		}
	}
}
