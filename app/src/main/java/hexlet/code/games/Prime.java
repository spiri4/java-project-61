package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Prime {

    private static final int ROUNDS = 3;
    private static final int MAX_NUMBER = 20;
    private static final String MAIN_QUESTION =
            "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void start(Scanner scanner) {
        String[][] rounds = new String[ROUNDS][2];
        Random random = new Random();

        for (int i = 0; i < ROUNDS; i++) {
            int number = random.nextInt(MAX_NUMBER) + 1;
            String correctAnswer = isPrime(number) ? "yes" : "no";
            String question = String.valueOf(number);

            rounds[i][0] = question;
            rounds[i][1] = correctAnswer;
        }

        Engine.play(MAIN_QUESTION, rounds, scanner);
    }

    private static boolean isPrime(int number) {
        // Нижняя граница для простых: числа меньше не считаются простыми.
        final int smallestPrime = 2;
        // Первый нечётный делитель для проверки (чётность уже отсечена выше).
        final int firstOddDivisor = 3;
        // Шаг перебора делителей: проверяем только нечётные числа.
        final int divisorStep = 2;

        if (number < smallestPrime) {
            return false;
        }
        if (number == smallestPrime) {
            return true;
        }
        if (number % smallestPrime == 0) {
            return false;
        }
        for (int divisor = firstOddDivisor; divisor * divisor <= number; divisor += divisorStep) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
