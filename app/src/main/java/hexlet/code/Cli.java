package hexlet.code;

import java.util.Scanner;
class Cli {
    public static void greeting(Scanner scanner) {
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        //return name; это был вариант если запоминать после первого гритинга
    }
}

