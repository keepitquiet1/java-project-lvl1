package hexlet.code;


import java.util.Scanner;

public class Engine {
    private static String name;
    public static final int ROUNDS_COUNT = 3;

    public static void run(String description, String[][] roundsData) {
        Scanner scanner = new Scanner(System.in);
        getName(scanner);
        for (int i = 0; i < roundsData.length; i++) {
            System.out.println(description);
            System.out.println(roundsData[i][0]);
            if (!scanner.nextLine().equalsIgnoreCase(roundsData[i][1])) {
                System.out.printf("Incorrect! The correct answer is %s. Lets try again, %s! %n",
                        roundsData[i][1], name);
                return;
            }
            System.out.println("Correct!");
        }
        System.out.printf("Congratulations, %s! You won! %n", name);

        System.out.println();
    }

    public static String getName(Scanner scanner) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        return name;
    }

}
