package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Gcd {

    private static final int ROUNDS = 3;
    private static final int MAX_NUMBER = 100;
    private static final String MAIN_QUESTION = "Find the greatest common divisor of given numbers.";
    private static final Random RANDOM = new Random();

    public static void start(Scanner scanner) {
        String[][] rounds = new String[ROUNDS][2];

        for (int i = 0; i < ROUNDS; i++) {
            int first = RANDOM.nextInt(MAX_NUMBER) + 1;
            int second = RANDOM.nextInt(MAX_NUMBER) + 1;
            int gcd = gcd(first, second);
            String question = first + " " + second;

            rounds[i][0] = question;
            rounds[i][1] = String.valueOf(gcd);
        }

        Engine.play(MAIN_QUESTION, rounds, scanner);
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
