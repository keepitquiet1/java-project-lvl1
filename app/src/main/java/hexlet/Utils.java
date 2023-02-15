package hexlet;

import java.util.Scanner;

public class Utils {

    static String name;

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static String getName(Scanner scanner) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        return name;
    }

    public static void calcIsNotCorrect(int correctAnswer) {
        System.out.printf("Incorrect! The correct answer is %d. Lets try again %s! %n", correctAnswer, name);
    }

    public static void isNotCorrect(String correctAnswer) {
        System.out.printf("Incorrect! The correct answer is %s. Lets try again %s! %n", correctAnswer, name);
    }

    public static void congrats() {
        System.out.printf("Congrats, %s! You won! %n", name);
    }

    public static String getName() {
        return name;
    }

    public static int gcdByEuclidAlgorithm(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcdByEuclidAlgorithm(n2, n1 % n2);
    }

    public static boolean isPrime(int n) {
        int count = 0;

        if (n < 2)
            return false;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }


}
