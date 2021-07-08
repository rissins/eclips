package example;

public class exx12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int sum1 = 0;
		int sum2 = 0;
		int count = 0;
		int count1 = 0;
		int[] number = {30, 70, 40, 60, 20, 40};
		for ( int i = 0; i < number.length; i++) {
			sum += number[i];
		}
		System.out.println("합은 " + sum + "입니다.");
		System.out.println("평균은 " + sum/number.length + "입니다.");

		System.out.println("---------------");
		
		for ( int value : number)
			if (value > 50)
				System.out.println(value);
				
		
		System.out.println("---------------");
		
		for (int j = 0; j < number.length; j++) {
			if(number[j] > 50) {
				sum1 += number[j];
				count++;
				} 
			else {
				sum2 += number[j];
				count1++;
				}
		}

		System.out.println(sum1/count);
		
		System.out.println(sum2/count1);
}
}
