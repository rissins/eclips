package example;
import java.util.*;
public class exx15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] computer = {"����", "����", "��"};
		String word;
		int num = 0;
		
		while (true) {
			
			System.out.println("���������� �Է�: ");
			word = input.next();
			num = (int)(Math.random()*3);
			
			if (word.equals(computer[num])) {
				System.out.println("�����ϴ�.");
			}
			else if(word.equals("����")){
				if (computer[num].equals("����")) {
					System.out.println("�����ϴ�.");	
				}
				else { 
					System.out.println("�̰���ϴ�.");
			
				}
			}
			else if(word.equals("����")){
				if (computer[num].equals("��")) {
					System.out.println("�����ϴ�.");	
				}
				else { 
					System.out.println("�̰���ϴ�.");
			
				}
			}
			else if(word.equals("��")){
				if (computer[num].equals("����")) {
					System.out.println("�����ϴ�.");	
				}
				else { 
					System.out.println("�̰���ϴ�.");
			
				}
			}
			else if(word.equals("�׸�")) {
				break;
			}
			else {
				System.out.println("���������� �Ǵ� �׸��� �Է��ϼ���: ");
			}

	}

	}	
}


//�Է¹��� ���� ������ ���� �̱�� ���� computer num�� Ȯ���ϴ� ���    ������ �̤Ť�

//������ 
//����