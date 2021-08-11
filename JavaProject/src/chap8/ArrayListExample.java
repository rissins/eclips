package chap8;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("Spring");
		int size = list.size();
		System.out.println("�� list ����: "+ size);
		
		String skill = list.get(2);
		System.out.println("2��° �ε���: " +skill);
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+": "+str);
		}
		
		System.out.println();
		list.remove(2);
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+": "+str);
		}
		
		System.out.println();
		list.remove(2);
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+": "+str);
		}
		
		System.out.println();
		list.remove("Spring");
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+": "+str);
		}
	}
}
