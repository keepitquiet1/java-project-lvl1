package hexlet.code.games;
import hexlet.Utils;
import hexlet.code.Engine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calc {
private static String userName;
    public static void runGame() {
        Scanner scanner = new Scanner(System.in);
        if (userName == null) {
            userName = Utils.getName(scanner);
        }

        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * a);
        List<Character> sign = new ArrayList<>();
        sign.add('+');
        sign.add('-');
        sign.add('*');
        char s = sign.get((int) (Math.random() * 3));

        System.out.println("What is the result of the expression?");
        System.out.printf("Question: %d %c %d = ", a, s, b);
        Engine.calc(a, b, s, scanner.nextInt());
        scanner.close();

    }
}
