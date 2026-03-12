package hexlet.code;

import java.util.Random;

public class Gcd implements Game {

    private static final int MAX_NUMBER = 100;
    private final Random random = new Random();

    @Override
    public String getDescription() {
        return "Find the greatest common divisor of given numbers.";
    }

    @Override
    public Round generateRound() {
        int first = random.nextInt(MAX_NUMBER) + 1;
        int second = random.nextInt(MAX_NUMBER) + 1;
        int gcd = gcd(first, second);
        String question = first + " " + second;
        return new Round(question, String.valueOf(gcd));
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}
