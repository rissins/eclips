package chap3;

public class ThrowsExample {
	public static void main(String[] args) {
		try {
			
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}
	}
	
	public static void findClass() throws {
		Class cl = Class.forName("java.lang.String")
	}
}
