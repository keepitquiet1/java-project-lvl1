package hexlet.code.games;

import hexlet.Utils;
import hexlet.code.Engine;


public class Even {
    private static final int MAX = 100;
    private static final String DESCRIPTION =
            "Answer 'yes' if number even otherwise answer 'no'.";

    private static String checkIfEven(int number) {
        if (number % 2 == 0) {
            return "yes";
        } else {
            return "no";
        }
    }

    private static String[] generateRoundData() {
        var number = Utils.getRandomNumber(0, MAX);
        return new String[]{Integer.toString(number), checkIfEven(number)};
    }

    public static void runGame() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i += 1) {
            roundsData[i] = generateRoundData();
        }

        Engine.run(DESCRIPTION, roundsData);
    }

}
