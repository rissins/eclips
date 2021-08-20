package Example;

interface Shape3 {
	final double PI = 3.14;

	void draw();

	double getArea();

	default public void redraw() {
		System.out.print("--- �ٽ� �׸��ϴ�. ");
		draw();
	}
}

class Circle3 implements Shape3 {
	private int r;

	public Circle3(int r) {
		this.r = r;
	}

	@Override
	public void draw() {
		System.out.println("�������� " + this.r + "�� ���Դϴ�.");
	}

	@Override
	public double getArea() {
		return PI * r * r;
	}
}

class Oval implements Shape3 {
	private int a, b;

	public Oval(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void draw() {
		System.out.println(this.a + "x" + this.b + "�� �����ϴ� Ÿ���Դϴ�.");
	}

	public double getArea() {
		return PI * a * b;
	}
}

class Rect2 implements Shape3 {
	private int a, b;

	public Rect2(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void draw() {
		System.out.println(this.a + "x" + this.b + "ũ���� �簢�� �Դϴ�.");
	}

	public double getArea() {
		return a * b;
	}
}

public class DrawCircle2 {
	public static void main(String[] args) {
		Shape3[] list = new Shape3[3]; // shape�� ��ӹ��� Ŭ���� ��ü�� ���۷��� �迭
		list[0] = new Circle3(10);
		list[1] = new Oval(20, 30);
		list[2] = new Rect2(10, 40);
		for (int i = 0; i < list.length; i++)
			list[i].redraw();
		for (int i = 0; i < list.length; i++)
			System.out.println("������ " + list[i].getArea());
	}
}
