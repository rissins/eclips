package chap5;

public class AnimalMain {
	public static void main(String[] args) {
//		Animal a = new Animal();
//		Bird b = new Bird();
		Penguin p = new Penguin();
		p.swim();
		Bird p2 = new Penguin();
		p2.walk();
		Penguin p3 = (Penguin) p2; // �ٿ�ĳ����
		p3.swim();
		
		Duck d = new Duck();
		d.swim();
		d.fly();
		Bird d2 = new Duck(); // ��ĳ����
		d2.walk();
		d2.eat();
		Duck d3 = (Duck) d2;
		d3.fly();
		
		Swim2[] s = new Swim2[2];
		s[0] = new Penguin();
		s[1] = new Duck();   // ��ü�迭 
		s[0].swim();
		
	}
}
