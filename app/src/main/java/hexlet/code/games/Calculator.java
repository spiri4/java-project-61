package hexlet.code.games;

import java.util.Random;

public class Calculator {

    private static final int MAX_NUMBER = 100;
    private static final char[] OPERATIONS = {'+', '-', '*'};
    private static final String DESCRIPTION = "What is the result of the expression?";

    public static String[] generateRound(Random random) {
        int first = random.nextInt(MAX_NUMBER) + 1;
        int second = random.nextInt(MAX_NUMBER) + 1;
        char operation = OPERATIONS[random.nextInt(OPERATIONS.length)];

        int correctAnswer = calculate(first, second, operation);
        String question = first + " " + operation + " " + second;
        return new String[] {DESCRIPTION, question, String.valueOf(correctAnswer)};
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
