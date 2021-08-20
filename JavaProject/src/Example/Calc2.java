package Example;

abstract class Calc2{
	protected int a, b;
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public abstract int calculate();
}
	
class Sum3 extends Calc2{
	
	@Override
	public int calculate() {
		return a+b;
	}
}

class Sub3 extends Calc2{
	
	@Override
	public int calculate() {
		return a-b;
	}
}
class Mul3 extends Calc2{
	
	@Override
	public int calculate() {
		return a*b;
	}
}
class Div3 extends Calc2{
	
	@Override
	public int calculate() {
		return a/b;
	}
}


public class Calc2  {

}
