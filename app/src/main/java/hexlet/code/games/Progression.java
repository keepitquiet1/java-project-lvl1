package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.Engine;


public class Progression {
    private static final int MAX = 100;
    private static final int PROGRESSION_LENGTH = 7;
    private static String answer = "none";

    private static final String DESCRIPTION = "What number is missing in the progression?";


    public static void runGame() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i += 1) {
            roundsData[i] = generateRoundData();
        }

        Engine.run(DESCRIPTION, roundsData);
    }

    private static String[] generateRoundData() {
        int hiddenIndex = Utils.getRandomNumber(0, PROGRESSION_LENGTH - 1);
        int step = Utils.getRandomNumber(1, 9);
        int first = Utils.getRandomNumber(0, 100);
        String[] progression = makeProgression(first, step, PROGRESSION_LENGTH);
        answer = progression[hiddenIndex];

        progression[hiddenIndex] = "..";
        String question = String.join(" ", progression);

        return new String[]{question, answer};
    }

    private static String[] makeProgression(int first, int step, int length) {
        String[] progression = new String[length];

        for (int i = 0; i < length; i += 1) {
            progression[i] = Integer.toString(first + i * step);
        }

        return progression;
    }
}
