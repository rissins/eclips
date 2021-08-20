package Example;

interface Shape {
	final double PI = 3.14; //상수
	void draw(); //도형을 그리는 추상 메소드
	double getArea(); //도형의 면적을 리턴하는 추상 메소드
	default public void redraw() { //디폴트 메소드
		System.out.print("--- 다시 그립니다. ");
		draw();
	}
}


public class Circle1 implements Shape {
	private int radius;
	private double area;
	
	Circle1 (int radius) {
		this.radius=radius;
		area=this.radius*this.radius*PI;
	}
	
	@Override
	public void draw() {
		System.out.println("반지름이 "+radius+"인 원입니다.");
	}
	
	@Override
	public double getArea() {
		return area;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape donut=new Circle1(10);
		donut.redraw();
		System.out.println("면적은 "+donut.getArea());
	}

}
