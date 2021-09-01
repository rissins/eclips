package question;

public class Won2Dollor {
	private int won;

	public int getWon() {
		return won;
	}

	public void setWon(int won) {
		this.won = won;
	}
	
	public double Process(int won) {
		return won / 1200.0;
	}
}
