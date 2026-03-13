package hexlet.code.games;

import java.util.Random;

public class Prime {

    private static final int MAX_NUMBER = 20;
    private static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    // Нижняя граница для простых: числа меньше не считаются простыми.
    private static final int SMALLEST_PRIME = 2;
    // Первый нечётный делитель для проверки (чётность уже отсечена выше).
    private static final int FIRST_ODD_DIVISOR = 3;
    // Шаг перебора делителей: проверяем только нечётные числа.
    private static final int DIVISOR_STEP = 2;

    public static String[] generateRound(Random random) {
        int number = random.nextInt(MAX_NUMBER) + 1;
        String correctAnswer = isPrime(number) ? "yes" : "no";
        return new String[] {DESCRIPTION, String.valueOf(number), correctAnswer};
    }

    private static boolean isPrime(int number) {
        if (number < SMALLEST_PRIME) {
            return false;
        }
        if (number == SMALLEST_PRIME) {
            return true;
        }
        if (number % SMALLEST_PRIME == 0) {
            return false;
        }
        for (int divisor = FIRST_ODD_DIVISOR; divisor * divisor <= number; divisor += DIVISOR_STEP) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
