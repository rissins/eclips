package Example;

class TV3{
	private int size;
	public TV3(int size) {
		this.size = size;
	}
	
	protected int getSize() {
		
		return size;
	}
}

class ColorTV4 extends TV2 {
	private int nColors;
	public ColorTV4(int size, int nColors) {
		super(size);
		this.nColors = nColors;
	}
	public void printProperty() {
		System.out.println(getSize()+"��ġ"+nColors+"�÷�");
	}
}

public class IPTV extends ColorTV4{
	private String ipAddress;
	public IPTV(String ipAddress, int size, int nColors) {
		super(size, nColors);
		this.ipAddress = ipAddress;
	}
	public void printProperty() {
		System.out.println("���� IPTV��" + ipAddress + "�ּ��� ");
		super.printProperty();
	}
	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();
	}
}