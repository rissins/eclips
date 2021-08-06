package chap5;

public class Duck extends Bird implements Swim2, Fly2{
//	public void swim() {
//		System.out.println("duck swim");
//	}
	
	@Override
	public void swim() {
		System.out.println("duck swim");
	}
	
	@Override
	public void fly() {
		System.out.println("duck fly");
	}
//	public void fly() {
//		System.out.println("duck fly");
//	}
		
}
