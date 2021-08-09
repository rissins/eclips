package Example;

import java.util.Scanner;

public class StudentDriver {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student student1 = new Student();
		
		student1.setName("°©µ¹ÀÌ");
		student1.getName(student1.setName());
		student1.setNumber(100);
		student1.getNumber(scanner.nextInt());
		
		System.out.println("ÀÌ¸§"+ student1.setName());
		
	}
}
