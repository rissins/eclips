package chap4;

public class Book {
	String title;
	String author;
	
	public Book(String t) {
		title = t;
		author = "���ڹ̻�";
	}
	public Book(String t, String a) {
		title = t;
		author = a;
	}
	
	public static void main(String[] args) {
		Book littlePrince = new Book("�����", "�������丮");
		System.out.println(littlePrince.title+ "  "+littlePrince.author);
		
		Book loveStory = new Book("������");
		System.out.println(loveStory.title+ "  " + loveStory.author);
	}
}
