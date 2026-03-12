package hexlet.code.games;

import java.util.Random;

public class Even {

    private static final int MAX_NUMBER = 100;
    private static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static String[] generateRound(Random random) {
        int number = random.nextInt(MAX_NUMBER) + 1;
        String correctAnswer = number % 2 == 0 ? "yes" : "no";
        return new String[] {DESCRIPTION, String.valueOf(number), correctAnswer};
    }
}

