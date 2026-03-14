package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Calculator {

    private static final int ROUNDS = 3;
    private static final int MAX_NUMBER = 100;
    private static final char[] OPERATIONS = {'+', '-', '*'};
    private static final String MAIN_QUESTION = "What is the result of the expression?";

    public static void start(Scanner scanner) {
        String[][] rounds = new String[ROUNDS][2];
        Random random = new Random();

        for (int i = 0; i < ROUNDS; i++) {
            int first = random.nextInt(MAX_NUMBER) + 1;
            int second = random.nextInt(MAX_NUMBER) + 1;
            char operation = OPERATIONS[random.nextInt(OPERATIONS.length)];

            int correctAnswer = calculate(first, second, operation);
            String question = first + " " + operation + " " + second;

            rounds[i][0] = question;
            rounds[i][1] = String.valueOf(correctAnswer);
        }

        Engine.play(MAIN_QUESTION, rounds, scanner);
    }

    private static int calculate(int first, int second, char operation) {
        return switch (operation) {
            case '+' -> first + second;
            case '-' -> first - second;
            case '*' -> first * second;
            default -> throw new IllegalArgumentException("Unknown operation: " + operation);
        };
    }
}
