import java.util.*;

public class DivideByZeroOk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		Scanner sc = new Scanner(System.in);
		System.err.print("������: ");
		x = sc.nextInt();
		System.out.print("����: ");
		y = sc.nextInt();
		
		try {
			int result = x/ y;
		} catch (ArithmeticException e){
			System.out.println("0���� ���� �� �����ϴ�.");
			System.exit(0);
		}
		System.out.println("���α׷��� ��� ����˴ϴ�.");
	}

}
