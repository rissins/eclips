package Example;

class PointTwo{
	private int x, y;

	public PointTwo(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}


public class ColorPointTwo extends PointTwo{
	String color;
	public ColorPointTwo() {
		this(0, 0);
	}
	
	public ColorPointTwo(int x, int y) {
		super(x, y);
		color = "BLACK";
	}
	
	public void setXY(int x, int y) {
		move(x, y);
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return color+"���� ("+getX()+","+ getY()+")�� ��";
	}
	
	public static void main(String[] args) {
		ColorPointTwo zeroPoint = new ColorPointTwo();
		System.out.println(zeroPoint.toString()+"�Դϴ�.");
		
		ColorPointTwo cp = new ColorPointTwo(10, 10);
		cp.setXY(5,  5);
		cp.setColor("RED");
		System.out.println(cp.toString());
	}
	

}
