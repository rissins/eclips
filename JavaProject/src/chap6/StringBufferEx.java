package chap6;

public class StringBufferEx {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This");
		
		System.out.println(sb);
		sb.append(" is pencil");
		System.out.println(sb);
		
		sb.insert(7,  " my");
		System.out.println(sb);
		
		sb.replace(8,  10,  "your");
		System.out.println(sb);
	}
}
