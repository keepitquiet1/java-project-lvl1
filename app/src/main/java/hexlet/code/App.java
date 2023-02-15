package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        String selectedGame = scanner.next();
        System.out.println();
        switch (selectedGame) {
            case "1" -> Cli.greet();
            case "2" -> Even.runGame();
            case "3" -> Calc.runGame();
            case "4" -> Gcd.runGame();
            case "5" -> Progression.runGame();
            case "6" -> Prime.runGame();
            case "0" -> System.out.println("Goodbye!");
            default -> System.out.println("Invalid number entered. Restart the game.");
        }
        scanner.close();
    }
}