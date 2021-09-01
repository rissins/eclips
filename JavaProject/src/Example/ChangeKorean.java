package Example;

import java.util.Scanner;

class Word {
	private String word;
	private String meaning;

	Word(String word, String meaning) {
		this.word = word;
		this.meaning = meaning;
	}

	public String getWord() {
		return word;
	}

	public String getMeaning() {
		return meaning;
	}

}

public class ChangeKorean{
	public static void main(String[] args) {
		Word[] object = { new Word("사랑", "love"), new Word("아기", "baby"), 
						new Word("돈", "money"),  new Word("미래", "future"), 
						new Word("희망", "hope") };
						  
		Scanner scan = new Scanner(System.in);
		System.out.println("한영 단어 검색 프로그램입니다.");

		while (true) {
			System.out.print("한글 단어? ");
			String str = scan.next();
			boolean flag = false;
			for (Word word : object) {
				if (str.equals(word.getWord())) {
					System.out.println(word.getWord() + "은 " + word.getMeaning());
					flag = true;
				}
			}
			if (str.equals("그만")) {
				break;
			}
			if (!flag) {
				System.out.println(str + "는 저의 사전에 없습니다.");
			}
		}
		scan.close();
	}
}

