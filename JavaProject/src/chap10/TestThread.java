package chap10;

public class TestThread{
	public static void main(String[] args) {
		TimerThread th = new TimerThread();
		th.start();
	}
}
