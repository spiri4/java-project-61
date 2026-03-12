package hexlet.code;

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
                    Engine.run(new Even(), scanner);
                    break;
                case 3:
                    Engine.run(new Calculator(), scanner);
                    break;
                case 4:
                    Engine.run(new Gcd(), scanner);
                    break;
                case 5:
                    Engine.run(new Progression(), scanner);
                    break;
                case 6:
                    Engine.run(new Prime(), scanner);
                    break;
                case 0:
                default:
                    break;
            }
        } while (choice != 0); //пока пользователь не нажмёт 0-Exit возвращаемся в главное меню

        scanner.close();
    }
}

