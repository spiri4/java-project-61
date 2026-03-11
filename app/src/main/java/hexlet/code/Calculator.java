package hexlet.code;

import java.util.Random;

public class Calculator implements Game {

    private static final int MAX_NUMBER = 100;
    private static final char[] OPERATIONS = {'+', '-', '*'};
    private final Random random = new Random();

    @Override
    public String getDescription() {
        return "What is the result of the expression?";
    }

    @Override
    public Round generateRound() {
        int first = random.nextInt(MAX_NUMBER) + 1;
        int second = random.nextInt(MAX_NUMBER) + 1;
        char operation = OPERATIONS[random.nextInt(OPERATIONS.length)];

        int correctAnswer = calculate(first, second, operation);
        String question = first + " " + operation + " " + second;
        return new Round(question, String.valueOf(correctAnswer));
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
