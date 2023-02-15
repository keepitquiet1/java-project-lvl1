package hexlet.code.games;

import hexlet.Utils;
import hexlet.code.Engine;

import java.util.Scanner;

public class Even {

    private static String userName;

    public static void runGame() {
        Scanner scanner = new Scanner(System.in);
        if (userName == null) {
            userName = Utils.getName(scanner);
        }
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        int rand = (int) (Math.random() * 100);
        System.out.println("Question: " + rand);
        System.out.println("Your answer: ");
        String input = scanner.nextLine();
        if (input != null) {
            Engine.even(rand, input);
        }
        scanner.close();
    }

    public static String getUserName() {
        return userName;
    }

}
