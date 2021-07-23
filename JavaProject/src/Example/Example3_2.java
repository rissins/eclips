package Example;

public class Example3_2 {
	public static void main(String[] args) {
		
		int num = 0;
		int sum = 0;
		
		while (num < 100) {
			
			if(num %2 == 0) {
				sum = num + sum;
			}
			num++;
			
			
		}
		
		System.out.println(sum);
	}
	

}
