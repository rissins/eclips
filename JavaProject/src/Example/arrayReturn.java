package Example;


class makeArray {
	
	public void makeArray (int num){
	int put = 1;
	put = put + num;
	int intArray[] = new int[10];
	for (int i = 0; i < intArray.length; i++) {
		intArray[i] = put;
		put++;

		System.out.print(intArray[i]+ "   ");
	}
	
}
}

public class arrayReturn {
	public static void main(String[] args) {
		makeArray x = new makeArray();
		x.makeArray(100);
	}
	
}
