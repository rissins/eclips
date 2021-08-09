package chap6;


class Point4{
	int x, y;
	public Point4(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point("+x+","+y+")";
	}
}	
public class ToStringEx {
	public static void main(String[] args) {
		Point4 p = new Point4(2, 3);
		System.out.println(p);
		System.out.println(p.toString());
	}
	
}
