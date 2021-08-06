package chap5;

class Shape{
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape{
	@Override // annotation
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape{
	@Override
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape{
	@Override
	public void draw() {
		System.out.println("Circle");
	}
}

public class MethodOverridingEx{
	static void paint(Shape p) { // Shape p = new Line();
		p.draw();
	}
	
	public static void main(String[] args) {
		Line line = new Line();
		paint(line);
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
	}
}
