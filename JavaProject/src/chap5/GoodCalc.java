package chap5;

abstract class Calcuator{
//	abstract public int add(int a, int b); // 접근지정자 리턴타입  메소드 매개변수
	public abstract int add(int a, int b); // 접근지정자 리턴타입  메소드 매개변수
	public abstract int subtract(int a, int b); // 접근지정자 리턴타입  메소드 매개변수
	public abstract double average(int[] a); // 접근지정자 리턴타입  메소드 매개변수
	
}
// 추상메소드를 구현을 안하면 추상메소드가 된다
public class GoodCalc extends Calcuator{
	@Override
	public int add(int a, int b) {
		return a + b;
	}
	@Override
	public int subtract(int a, int b) {
		return a - b;
	}
	@Override
	public double average (int[] a) {
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum/a.length;
	}
	public static void main(String[] args) {
		GoodCalc c = new GoodCalc();
		System.out.println(c.add(2, 3));
		System.out.println(c.subtract(2, 3));
		System.out.println(c.average(new int[] {2,3,4}));
	}
	

}
