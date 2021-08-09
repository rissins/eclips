package Example;

public class ArraySum {
	public static void main(String[] args) {
		int twoDIntArray[][] = new int[120][5];
		int num = 101;
		int sum = 0;
		
		for (int i = 0; i < twoDIntArray.length; i++) {
			twoDIntArray[i][0] = num;
			num ++;
			twoDIntArray[i][1] = num;
			num ++;
			twoDIntArray[i][2] = num;
			num ++;
			twoDIntArray[i][3] = num;
			num ++;
			twoDIntArray[i][4] = num;
			num += 96;		
			for (int j = 0; j < 5; j++) {				
				sum += twoDIntArray[i][j];
			}
		}		
		System.out.println("1년 신생아 "+sum);	
	}
}
