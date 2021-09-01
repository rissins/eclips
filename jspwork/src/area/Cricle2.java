package area;

public class Cricle2 {
	
	private int radius;
	
	public double Process(int radius) {
		getRadius();
		return radius*radius*Math.PI;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
}
