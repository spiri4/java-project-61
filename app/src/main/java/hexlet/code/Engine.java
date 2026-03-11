package hexlet.code;

import java.util.Scanner;

public class Engine {

    private static final int ROUNDS = 3;

    public static void run(Game game, Scanner scanner) {
        String name = Cli.greeting(scanner);
        System.out.println(game.getDescription());

        for (int i = 0; i < ROUNDS; i++) {
            Round round = game.generateRound();

            System.out.println("Question: " + round.getQuestion());
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine().trim();

            String correctAnswer = round.getCorrectAnswer();
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
