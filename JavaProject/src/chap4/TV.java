package chap4;

public class TV {
	private String manufacturer;
	private int year;
	private int size;
	
	public TV(String manufacturer, int year, int size) {
		this.manufacturer = manufacturer;
		this.year = year;
		this.size = size;
	}
	
	public void show() {
		System.out.println(this.manufacturer + "���� ����");
		System.out.println(this.year + "����");
		System.out.println(this.size + "��ġ TV");
		
	}
	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
	}
}
