package example;

public class exx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int height = 150;
		int grade = 70;
		int rainfall = 50;
		
		if (grade > 60)
			System.out.println("�հ��Դϴ�.");
		else
			System.out.println("���հ��Դϴ�.");
		System.out.println("------------------");
		
		if ( height > 140 && height <180)
			System.out.println("ž�� �����մϴ�.");
		else 
			System.out.println("ž�� �Ұ����մϴ�.");
		
		System.out.println("------------------");
		
		if(rainfall < 60 )
			System.out.println("��ҽ�");
		else if ( rainfall >= 60 && rainfall < 90)
			System.out.println("ȣ�� ���Ǻ�");
		else
			System.out.println("ȣ�� �溸");
		
		
		
		
		
	}

}
