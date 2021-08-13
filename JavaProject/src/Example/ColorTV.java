package Example;

class TV2{
	private int size;
	public TV2(int size) {
		this.size = size;
	}
	
	protected int getSize() {
		
		return size;
	}
}

public class ColorTV extends TV2 {
	private int nColors;
	public ColorTV(int size, int nColors) {
		super(size);
		this.nColors = nColors;
	}
	public void printProperty() {
		System.out.println(getSize()+"인치"+nColors+"컬러");
	}
	
	public static void main(String[] args) {
		ColorTV3 myTV = new ColorTV3(32, 1024);
		myTV.printProperty();
	}
	

}
