package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.Engine;


public class Progression {
    private static final int MAX = 100;
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

        return new String[]{makeProgression(), answer};
    }

    private static String makeProgression() {
        int length = Utils.getRandomNumber(5, 10);
        int secretIndex = Utils.getRandomNumber(0, length - 1);
        int step = Utils.getRandomNumber(1, 9);
        int element = Utils.getRandomNumber(0, 100);
        String question = "";
        for (int i = 0; i < length; i++) {
            if (i == secretIndex) {
                question += ".. ";
                answer = Integer.toString(element);
            } else {
                question += element + " ";
            }
            element += step;
        }
        return question;
    }
}
