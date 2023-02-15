package hexlet.code.games;

import hexlet.Utils;
import hexlet.code.Engine;

import java.util.Scanner;

public class Progression {
    private static String name;

    public static void runGame() {
        Scanner scanner = new Scanner(System.in);
        if (name == null) {
            name = Utils.getName(scanner);
        }
        System.out.println("What number is missing in the progression?");
        int lengthArray = Utils.getRandomNumber(5, 10);
        int secretIndex = Utils.getRandomNumber(0, lengthArray - 1);
        int step = Utils.getRandomNumber(1, 9);
        int firstNumber = Utils.getRandomNumber(0, 100);
        System.out.println("Question: ");
        int[] arr = new int[lengthArray];

        for (int i = 0; i < lengthArray; i++) {
            arr[i] = firstNumber + (step * i);
            if (i == secretIndex) {
                System.out.println("..");
            } else {
                System.out.println(arr[i]);
            }
        }
        Engine.progression(scanner.nextInt(), arr, secretIndex);

    }
}
