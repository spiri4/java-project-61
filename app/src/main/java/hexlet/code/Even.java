package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {

    private static final int ROUNDS = 3; //кол-во раундов в игре
    private static final int MAX_NUMBER = 100; //случайные числа будем генерить в интервале от 1 до 100

    public static void run(Scanner scanner, String name) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        Random random = new Random();

        for (int i = 0; i < ROUNDS; i++) {
            int number = random.nextInt(MAX_NUMBER) + 1;
            String correctAnswer = number % 2 == 0 ? "yes" : "no";

            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine().trim().toLowerCase();

            if (!userAnswer.equals(correctAnswer)) {
                System.out.println("'" + userAnswer
                        + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }

            System.out.println("Correct!");
        }

        System.out.println("Congratulations, " + name + "!");
    }
}
