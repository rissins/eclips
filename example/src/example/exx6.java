package example;

public class exx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int height = 150;
		int grade = 70;
		int rainfall = 50;
		
		if (grade > 60)
			System.out.println("합격입니다.");
		else
			System.out.println("불합격입니다.");
		System.out.println("------------------");
		
		if ( height > 140 && height <180)
			System.out.println("탑승 가능합니다.");
		else 
			System.out.println("탑승 불가능합니다.");
		
		System.out.println("------------------");
		
		if(rainfall < 60 )
			System.out.println("비소식");
		else if ( rainfall >= 60 && rainfall < 90)
			System.out.println("호우 주의보");
		else
			System.out.println("호우 경보");
		
		
		
		
		
	}

}
