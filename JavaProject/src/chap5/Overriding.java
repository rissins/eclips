package chap5;

class Weapon{
	
	protected int fire() { // int : 리턴타입, fire : method
		return 1;
	}
}

class Cannon extends Weapon{
	@Override
	protected int fire() {
		return 10;
	}
}

public class Overriding {
	public static void main(String[] args) {
		Weapon weapon;
		weapon = new Weapon();
		System.out.println("기본 무기의살상 능력은 "+ weapon.fire());
		
		weapon = new Cannon();
		System.out.println("대포 무기의살상 능력은 "+ weapon.fire());
		
	}
}
