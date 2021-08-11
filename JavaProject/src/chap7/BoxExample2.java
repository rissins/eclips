package chap7;

public class BoxExample2 {
	public static void main(String[] args) {
		Box2<String> box2 = new Box2<String>();
		box2.set("hello");
		String greet = box2.get();
		System.out.println(greet);
		
		Box2<Integer> box3 = new Box2<Integer>();
		box3.set(7);
		int value = box3.get();
		System.out.println(value);
	}
}
