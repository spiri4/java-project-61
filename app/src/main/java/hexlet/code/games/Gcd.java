package hexlet.code.games;

import java.util.Random;

public class Gcd {

    private static final int MAX_NUMBER = 100;
    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";

    public static String[] generateRound(Random random) {
        int first = random.nextInt(MAX_NUMBER) + 1;
        int second = random.nextInt(MAX_NUMBER) + 1;
        int gcd = gcd(first, second);
        String question = first + " " + second;
        return new String[] {DESCRIPTION, question, String.valueOf(gcd)};
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
