package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Even {

    private static final int ROUNDS = 3;
    private static final int MAX_NUMBER = 100;
    private static final String MAIN_QUESTION =
            "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final Random RANDOM = new Random();

    public static void start(Scanner scanner) {
        String[][] rounds = new String[ROUNDS][2];

        for (int i = 0; i < ROUNDS; i++) {
            int number = RANDOM.nextInt(MAX_NUMBER) + 1;
            String question = String.valueOf(number);
            String correctAnswer = number % 2 == 0 ? "yes" : "no";

            rounds[i][0] = question;
            rounds[i][1] = correctAnswer;
        }

        Engine.play(MAIN_QUESTION, rounds, scanner);
    }
}

