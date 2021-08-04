package chap4;

public class twoDArray {
	public static void main(String[] args) {
		int[][] intArray = new int[4][4];
		
		
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray.length; j++) {
				intArray[j][j] = (int) (Math.random()*10)+1;
				System.out.print(intArray[j][j]+"  ");
			}
			System.out.println("");
		}
		
		
	}
}
