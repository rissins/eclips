import java.util.Scanner;
public class Nanugi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y ;
		Scanner input = new Scanner(System.in);
		System.out.print("�������� �� 2���� �Է��Ͻÿ�");
		x = input.nextInt();
		y = input.nextInt();
		
		try {
			int result = x/y;
		
		}catch (Exception e) {
			System.out.println("����");
		}
		System.out.println("����");
	}
	
}
