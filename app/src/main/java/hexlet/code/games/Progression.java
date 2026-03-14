package hexlet.code.games;

import hexlet.code.Engine;

import java.security.SecureRandom;
import java.util.Scanner;

public class Progression {

    private static final int ROUNDS = 3;
    // Минимальная длина прогрессии (сколько чисел показываем в Question).
    private static final int MIN_LENGTH = 5;
    // Максимальная длина прогрессии.
    private static final int MAX_LENGTH = 10;
    // Диапазон для первого числа прогрессии (start генерируется в диапазоне [1..RANGE]).
    private static final int RANGE = 50;
    // Максимальный шаг прогрессии (step генерируется в диапазоне [1..MAX_STEP]).
    private static final int MAX_STEP = 9;
    private static final String MAIN_QUESTION = "What number is missing in the progression?";
    private static final SecureRandom RANDOM = new SecureRandom();

    public static void start(Scanner scanner) {
        String[][] rounds = new String[ROUNDS][2];

        for (int roundIndex = 0; roundIndex < ROUNDS; roundIndex++) {
            int length = RANDOM.nextInt(MAX_LENGTH - MIN_LENGTH + 1) + MIN_LENGTH;
            int start = RANDOM.nextInt(RANGE) + 1;
            int step = RANDOM.nextInt(MAX_STEP) + 1;

            int hiddenIndex = RANDOM.nextInt(length - 2) + 1; // [1 .. length-2]

            String[] progression = buildProgression(start, step, length);
            String correctAnswer = progression[hiddenIndex];
            progression[hiddenIndex] = "..";
            String question = String.join(" ", progression);

            rounds[roundIndex][0] = question;
            rounds[roundIndex][1] = correctAnswer;
        }

        Engine.play(MAIN_QUESTION, rounds, scanner);
    }

    private static String[] buildProgression(int start, int step, int length) {
        String[] result = new String[length];
        for (int i = 0; i < length; i++) {
            int currentElement = start + i * step;
            result[i] = String.valueOf(currentElement);
        }
        return result;
    }
}
