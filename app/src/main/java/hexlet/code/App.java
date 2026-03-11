package hexlet.code;

import java.util.Scanner;

public class App {

    private static String playerName = "";

    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");
        Scanner scanner = new Scanner(System.in);

        int choice = -1;
        do {
            System.out.println("Please enter the game number and press Enter.");
            System.out.println("1 - Greet");
            System.out.println("2 - Even");
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
                    playerName = Cli.greeting(scanner);
                    break;
                case 2:
                    if (playerName.isEmpty()) {
                        playerName = Cli.greeting(scanner);
                    } else {
                        System.out.println("Hello, " + playerName + "!");
                    }
                    Even.run(scanner, playerName);
                    break;
                case 0:
                default:
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }
}

