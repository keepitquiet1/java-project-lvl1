package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.Engine;


public class Prime {
    private static final int MAX = 100;
    private static final String DESCRIPTION = "Answer 'yes' if the next number is prime, otherwise 'no'.";

    public static void runGame() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i += 1) {
            roundsData[i] = generateRoundData();
        }

        Engine.run(DESCRIPTION, roundsData);
    }

    private static String[] generateRoundData() {
        int number = Utils.getRandomNumber(1, MAX);
        String answer = isPrime(number) ? "yes" : "no";

        return new String[]{Integer.toString(number), answer};
    }

    private static boolean isPrime(int n) {

        if (n < 2) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

}
