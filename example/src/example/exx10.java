package example;
import java.util.*;
public class exx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0;
		int aa = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("���ڸ� �Է��Ͻÿ�: ");
		number = scan.nextInt();
		while (true) {
			aa++;
			System.out.println(aa + "��° �ݺ����Դϴ�.");
			System.out.print("���ڸ� �Է��ϼ���: ");
			if (scan.nextInt() == 0)
				break;
		}
		System.out.println("�ݺ��� �������ϴ�.");
		

}
}
