package hexlet.code;

import java.util.Random;

public class Progression implements Game {

    // Минимальная длина прогрессии (сколько чисел показываем в Question).
    private static final int MIN_LENGTH = 5;
    // Максимальная длина прогрессии.
    private static final int MAX_LENGTH = 10;
    // Диапазон для первого числа прогрессии (start генерируется в диапазоне [1..RANGE]).
    private static final int RANGE = 50;
    // Максимальный шаг прогрессии (step генерируется в диапазоне [1..MAX_STEP]).
    private static final int MAX_STEP = 9;

    private final Random random = new Random();

    @Override
    public String getDescription() {
        return "What number is missing in the progression?";
    }

    @Override
    public Round generateRound() {
        int length = random.nextInt(MAX_LENGTH - MIN_LENGTH + 1) + MIN_LENGTH;
        int start = random.nextInt(RANGE) + 1;
        int step = random.nextInt(MAX_STEP) + 1;

        int hiddenIndex = random.nextInt(length - 2) + 1; // [1 .. length-2]

        int[] progression = buildProgression(start, step, length);
        String correctAnswer = String.valueOf(progression[hiddenIndex]);

        String question = formatQuestion(progression, hiddenIndex);
        return new Round(question, correctAnswer);
    }

    private static int[] buildProgression(int start, int step, int length) {
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = start + i * step;
        }
        return result;
    }

    private static String formatQuestion(int[] progression, int hiddenIndex) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < progression.length; i++) {
            if (i > 0) {
                sb.append(' ');
            }
            if (i == hiddenIndex) {
                sb.append("..");
            } else {
                sb.append(progression[i]);
            }
        }
        return sb.toString();
    }
}
