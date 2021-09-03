package question;

public class Rectangle {
	private int x;
	private int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public String Process(int x, int y) {
		String result;
		if(100 < x && x < 200) {
			result = "있습니다.";
		}else {
			result = "없습니다.";
		}
		return result;
		
	}
}
