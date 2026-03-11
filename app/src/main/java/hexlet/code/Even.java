package hexlet.code;

import java.util.Random;

public class Even implements Game {

    private static final int MAX_NUMBER = 100;
    private final Random random = new Random();

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    @Override
    public String getDescription() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    @Override
    public Round generateRound() {
        int number = random.nextInt(MAX_NUMBER) + 1;
        String question = String.valueOf(number);
        String correctAnswer = isEven(number) ? "yes" : "no";
        return new Round(question, correctAnswer);
    }
}
