package example;
import java.util.*;
public class exx14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�ֻ����� �Է��Ͻÿ�: ");
		Scanner scan = new Scanner(System.in);
		
		String word;
		while (true) {
			System.out.println("�ֻ���, �׸�: ");
			word = scan.next();
			if(word.equals("�ֻ���")) {
				System.out.println((int)(Math.random()*6+1));
			}
			else if ( word.equals("�׸�")){
				break;
			}
			else {
				System.out.println("�ֻ��� �Ǵ� �׸��� �Է��ϼ���.");
			}
		}
		System.out.println("�ݺ��� ����ƽ��ϴ�.");
	}

}



