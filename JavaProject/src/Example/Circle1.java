package Example;

interface Shape {
	final double PI = 3.14; //���
	void draw(); //������ �׸��� �߻� �޼ҵ�
	double getArea(); //������ ������ �����ϴ� �߻� �޼ҵ�
	default public void redraw() { //����Ʈ �޼ҵ�
		System.out.print("--- �ٽ� �׸��ϴ�. ");
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
		System.out.println("�������� "+radius+"�� ���Դϴ�.");
	}
	
	@Override
	public double getArea() {
		return area;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape donut=new Circle1(10);
		donut.redraw();
		System.out.println("������ "+donut.getArea());
	}

}
