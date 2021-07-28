package Example;

public class DoWhileTest {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		do {
			
			if(i%2 == 0) {
				sum = sum + i;
			}
			i++;
		}while(i < 100);
		System.out.println(sum);
	}
	
}
