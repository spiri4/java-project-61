package hexlet.code;

import java.util.Scanner;

public class Engine {

    private static final int ROUNDS = 3;

    public static void play(String mainQuestion, String[][] rounds, Scanner scanner) {
        String name = Cli.greeting(scanner);
        System.out.println(mainQuestion);

        for (int i = 0; i < ROUNDS; i++) {
            String question = rounds[i][0];
            String correctAnswer = rounds[i][1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine().trim();

            if (!userAnswer.equals(correctAnswer)) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }

            System.out.println("Correct!");
        }

        System.out.println("Congratulations, " + name + "!");
    }
}
