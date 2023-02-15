package hexlet.code.games;

import hexlet.Utils;
import hexlet.code.Engine;

import java.util.Scanner;

public class Gcd {
    private static String name;

    public static void runGame() {
        Scanner scanner = new Scanner(System.in);
        if (name == null) name = Utils.getName(scanner);
        System.out.println("Find the greatest common divisor of given numbers.");
        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);
        System.out.println("Question: " + a + " " + b);
        System.out.println("Your answer: ");
        Engine.gcd(scanner, a, b);

    }
}
