package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {

    private static final int EXIT = 0;
    private static final int GREET = 1;
    private static final int EVEN = 2;
    private static final int CALC = 3;
    private static final int GCD = 4;
    private static final int PROGRESSION = 5;
    private static final int PRIME = 6;

    private static final int INVALID_CHOICE = -1;

    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println(GREET + " - Greet");
        System.out.println(EVEN + " - Even");
        System.out.println(CALC + " - Calc");
        System.out.println(GCD + " - GCD");
        System.out.println(PROGRESSION + " - Progression");
        System.out.println(PRIME + " - Prime");
        System.out.println(EXIT + " - Exit");
        System.out.print("Your choice: ");

        int choice = INVALID_CHOICE;
        if (scanner.hasNextInt()) {
            choice = scanner.nextInt();
        } else {
            scanner.next(); // consume invalid input
        }
        scanner.nextLine(); // consume newline after number

        switch (choice) {
            case GREET:
                Cli.greeting(scanner);
                break;
            case EVEN:
                Even.start(scanner);
                break;
            case CALC:
                Calculator.start(scanner);
                break;
            case GCD:
                Gcd.start(scanner);
                break;
            case PROGRESSION:
                Progression.start(scanner);
                break;
            case PRIME:
                Prime.start(scanner);
                break;
            case EXIT:
            default:
                break;
        }

        scanner.close();
    }
}



