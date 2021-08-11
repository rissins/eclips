package chap6;
import java.util.StringTokenizer;

public class StringTokenizerEx {
    public static void main(String[] args) {
        String query = "È«±æµ¿/ÀåÈ­/È«·Ã/ÄáÁã/ÆÏÁã";
        StringTokenizer st = new StringTokenizer(query,"/");


        while (st.hasMoreTokens()) {
        	System.out.println(st.nextToken());
        }
    }
}