package hexlet.code.games;

import hexlet.Utils;
import hexlet.code.Engine;



public class Prime {
    private static final int MAX = 100;
    private static final String DESCRIPTION =
            "Answer 'yes' if the next number is prime, otherwise 'no'.";

    public static void runGame() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i += 1) {
            roundsData[i] = generateRoundData();
        }

        Engine.run(DESCRIPTION, roundsData);
    }

    private static String[] generateRoundData() {
        int number = Utils.getRandomNumber(1, MAX);
        String answer = Utils.isPrime(number) ? "yes" : "no";

        return new String[]{Integer.toString(number), answer};
    }
}
