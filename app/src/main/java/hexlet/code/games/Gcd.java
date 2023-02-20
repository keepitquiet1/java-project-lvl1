package hexlet.code.games;

import hexlet.Utils;
import hexlet.code.Engine;

public class Gcd {
    private static final int MAX = 100;
    private static final String DESCRIPTION =
            "Find the greatest common divisor of given numbers.";

    public static void runGame() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i += 1) {
            roundsData[i] = generateRoundData();
        }
        Engine.run(DESCRIPTION, roundsData);
    }

    private static String[] generateRoundData() {
        int number1 = Utils.getRandomNumber(1, MAX);
        int number2 = Utils.getRandomNumber(1, MAX);
        int gcd = gcdByEuclidAlgorithm(number1, number2);
        return new String[]{number1 + " " + number2, Integer.toString(gcd)};
    }

    private static int gcdByEuclidAlgorithm(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcdByEuclidAlgorithm(n2, n1 % n2);
    }



}
