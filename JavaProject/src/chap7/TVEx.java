package chap7;

class ColorTV extends TV {
	   private int resolution;
	   ColorTV(int size, int resolution) {
	      super(size);
	      this.resolution = resolution;
	   }
	   public void printProperty() {
	      System.out.print(getSize()+"인치 "+resolution+"컬러");
	   }
}
public class TVEx {
	public static void main(String[] args) {
		   ColorTV myTV = new ColorTV(32, 1024);
		   myTV.printProperty();	
	}
}
