package Example;

import java.util.Scanner;

public class PersonDriver {
	public static void main(String[] args) {
		String fname;
		String lname;
		Person person1, person2;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���� �Է��ϼ���: ");
		lname = scanner.next();
		
		System.out.println("�̸��� �Է��ϼ���: ");
		fname = scanner.next();
		
		person1 = new Person();
		person1.lastName = lname;
		person1.firstName = fname;
		System.out.println("��: "+person1.getLastName()+"�̸�: "+person1.getFirstName()+"������ ����: " +person1.getLength());
	
		
		System.out.println("���� �Է��ϼ���: ");
		lname = scanner.next();
		
		System.out.println("�̸��� �Է��ϼ���: ");
		fname = scanner.next();
		
		person2 = new Person();
		person2.lastName = lname;
		person2.firstName = fname;
		System.out.println("��: "+person2.getLastName()+"�̸�: "+person2.getFirstName()+"������ ����: " +person2.getLength());
	}
	
}
