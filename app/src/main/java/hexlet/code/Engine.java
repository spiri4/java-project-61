package hexlet.code;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Random;
import java.util.Scanner;

public class Engine {

    private static final int ROUNDS = 3;
    private static final Random RANDOM = new Random();

    public static void run(Scanner scanner, Class<?> gameClass) {
        String name = Cli.greeting(scanner);

        for (int i = 0; i < ROUNDS; i++) {
            String[] round = getDescriptionQuestionAnswer(gameClass);
            String description = round[0];
            String question = round[1];
            String correctAnswer = round[2];

            if (i == 0) {
                System.out.println(description);
            }

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine().trim().toLowerCase();

            if (!userAnswer.equals(correctAnswer.toLowerCase())) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }

            System.out.println("Correct!");
        }

        System.out.println("Congratulations, " + name + "!");
    }
    /* getDescriptionQuestionAnswer возвращает массив из трёх строк с параметрами игры,
     всё что нужно чтоб запустить один раунд:
    [0] — description
    [1] — question
    [2] — correctAnswer
     */
    private static String[] getDescriptionQuestionAnswer(Class<?> gameClass) {
        try {
            Method roundMethod = gameClass.getMethod("generateRound", Random.class);
            Object roundResult = roundMethod.invoke(null, RANDOM);
            return (String[]) roundResult;
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException(
                    "Game class must have public static String[] generateRound(Random)",
                    e
            );
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Cannot access game methods in " + gameClass.getName(), e);
        } catch (InvocationTargetException e) {
            throw new IllegalStateException("Game method call failed in "
                    + gameClass.getName(), e.getTargetException());
        }
    }
}
