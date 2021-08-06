package Example;

public class CoronaSum {
	public static void main(String[] args) {
		int twoDIntArray[][] = new int[12][3];
		int num = 11;
		int sum = 0;
		
		for (int i = 0; i < twoDIntArray.length; i++) {
			twoDIntArray[i][0] = num;
			num ++;
			twoDIntArray[i][1] = num;
			num ++;
			twoDIntArray[i][2] = num;
			num += 8;		
			for (int j = 0; j < 3; j++) {				
				sum += twoDIntArray[i][j];
			}
		}		
		System.out.println("1년 코로나 환자수 "+sum);	
	}	
}
