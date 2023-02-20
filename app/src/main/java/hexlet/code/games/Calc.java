package hexlet.code.games;

import hexlet.Utils;
import hexlet.code.Engine;

public class Calc {

    private static final int MIN = 1;
    private static final int MAX = 20;
    private static final char[] OPERATORS = {'+', '-', '*'};

    // Описание задается на уровне модуля (а не внутри методов), так проще видеть ключевые части игры
    private static final String DESCRIPTION =
            "What is the result of the expression?";


    private static int calculate(char operator, int number1, int number2) {
        switch (operator) {
            case '+':
                return number1 + number2;
            case '-':
                return number1 - number2;
            case '*':
                return number1 * number2;
            default:
                throw new RuntimeException("Unknown operator: " + operator);
        }
    }

    private static String[] generateRoundData() {
        var number1 = Utils.getRandomNumber(MIN, MAX);
        var number2 = Utils.getRandomNumber(MIN, MAX);

        var indexOperator = Utils.getRandomNumber(0, OPERATORS.length - 1);
        var operator = OPERATORS[indexOperator];

        var question = number1 + " " + operator + " " + number2;
        var answer = Integer.toString(calculate(operator, number1, number2));

        return new String[]{question, answer};
    }


    public static void runGame() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i += 1) {
            roundsData[i] = generateRoundData();
        }

        Engine.run(DESCRIPTION, roundsData);
    }
}
