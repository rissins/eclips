package Exam;

import java.util.HashMap;
import java.util.Map;

public class Games369 {

    public static final int MAX_NUMBER = 100;
    public static final int START_NUMBER = 1;

    public static void main(String[] args) {
        final Map<Integer, String> map = new HashMap<Integer, String>() {
            {
                put(1, "한");
                put(2, "두");
                put(3, "세");
            }
        };

        int gameNumber = START_NUMBER;

        while (gameNumber < MAX_NUMBER) {
            int countOf369 = 0;

            String strGameNumber = String.valueOf(gameNumber);

            for (char charGameNumber : strGameNumber.toCharArray()) {
                if (charGameNumber == '3' || charGameNumber == '6' || charGameNumber == '9') {
                    countOf369++;
                }
            }

            if (countOf369 > 0) {
                System.out.println(gameNumber + "  박수" + map.get(countOf369) + "번");
            }
            gameNumber++;

        }
    }
}
