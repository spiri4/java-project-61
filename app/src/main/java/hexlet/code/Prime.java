package hexlet.code;

import java.util.Random;

public class Prime implements Game {

    private static final int MAX_NUMBER = 20;
    private final Random random = new Random();

    @Override
    public String getDescription() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    @Override
    public Round generateRound() {
        int number = random.nextInt(MAX_NUMBER) + 1;
        String correctAnswer = isPrime(number) ? "yes" : "no";
        return new Round(String.valueOf(number), correctAnswer);
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
