package hexlet.code;

import hexlet.Utils;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Engine {
    private static int score = 0;

    public static void even(int number, String input) {

        Map<Integer, String> answers = new HashMap<>();
        answers.put(0, "yes");
        answers.put(1, "no");
        if (input.equalsIgnoreCase(answers.get(number % 2))) {
            System.out.println("Correct!");
            score++;
            if (score == 3) {
                Utils.congrats();
                return;
            }
            Even.runGame();
        } else {
            System.out.printf("Incorrect! The correct answer is %s. Lets try again %s! %n", answers.get(number % 2), Even.getUserName());
        }

    }

    public static void calc(int a, int b, char sign, int input) {
        switch (sign) {
            case '+':
                if (a + b != input) {
                    Utils.calcIsNotCorrect(a + b);
                    return;
                }
                break;
            case '-':
                if (a - b != input) {
                    Utils.calcIsNotCorrect(a - b);
                    return;
                }
                break;
            case '*':
                if (a * b != input) {
                    Utils.calcIsNotCorrect(a * b);
                    return;
                }
                break;
        }
        System.out.println("Correct!");

        score++;
        if (score == 3) {
            Utils.congrats();
            return;
        }
        Calc.runGame();
    }

    public static void gcd(Scanner scanner, int a, int b) {
        int answer = scanner.nextInt();
        int gcd = Utils.gcdByEuclidAlgorithm(a, b);
        if (answer != gcd) {
            System.out.println(answer + " is wrong answer ;(. Correct answer was " + gcd);
            return;
        }
        System.out.println("Correct!");
        score++;
        if (score == 3) {
            Utils.congrats();
            return;
        }
        Gcd.runGame();
    }

    public static void progression(int answer, int arr[], int secretIndex) {
        if (arr[secretIndex] != answer) {
            System.out.println(answer + " is wrong answer ;(. Correct answer was " + arr[secretIndex] + ".");

        }
        System.out.println("Correct!");
        score++;
        if (score == 3) {
            Utils.congrats();
            return;
        }
        Progression.runGame();

    }

    public static void prime(int number, String input) {
        Map<String, Boolean> answers = new HashMap<>();
        answers.put("yes", true);
        answers.put("no", false);
        if (!Utils.isPrime(number) == answers.get(input)) {
            Utils.isNotCorrect(input);
            return;
        }
        System.out.println("Correct!");
        score++;
        if (score == 3) {
            Utils.congrats();
            return;
        }
        Prime.runGame();

    }
}
