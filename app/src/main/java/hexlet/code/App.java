package hexlet.code;

import hexlet.code.games.Calculator; // линтер не разрешает сделать hexlet.code.games.* :)
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");
        Scanner scanner = new Scanner(System.in);

        int choice = -1;
        do {
            System.out.println("Please enter the game number and press Enter.");
            System.out.println("1 - Greet");
            System.out.println("2 - Even");
            System.out.println("3 - Calc");
            System.out.println("4 - GCD");
            System.out.println("5 - Progression");
            System.out.println("6 - Prime");
            System.out.println("0 - Exit");
            System.out.print("Your choice: ");

            if (!scanner.hasNextInt()) {
                scanner.next(); // consume invalid input
                continue;
            }

            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline after number

            switch (choice) {
                case 1:
                    Cli.greeting(scanner);
                    break;
                case 2:
                    Engine.run(scanner, Even.class);
                    break;
                case 3:
                    Engine.run(scanner, Calculator.class);
                    break;
                case 4:
                    Engine.run(scanner, Gcd.class);
                    break;
                case 5:
                    Engine.run(scanner, Progression.class);
                    break;
                case 6:
                    Engine.run(scanner, Prime.class);
                    break;
                case 0:
                default:
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }
}

