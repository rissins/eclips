package chap4;

public class RandomTen {
	public static void main(String[] args) {
		System.out.println("·£´ıÇÑ Á¤¼öµé ");
		int num[] = new int[10];
		double sum = 0;
		for (int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random()*10)+1;
			System.out.print(num[i]+ " ");
			sum = num[i] + sum;
		}
		System.out.println("\nÆò±ÕÀº " +sum / num.length);
	}
}
