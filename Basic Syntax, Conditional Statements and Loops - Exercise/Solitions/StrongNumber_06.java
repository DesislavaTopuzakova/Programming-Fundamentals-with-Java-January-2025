package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class StrongNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int number = Integer.parseInt(input);
        int totalSum = 0;
        for (int i = 0; i < input.length(); i++) {

            int currentNum = Integer.parseInt(input.charAt(i) + "");

            int factorial = 1;
            for (int j = 2; j <= currentNum; j++) {

                factorial = factorial * j;
            }

            totalSum += factorial;
        }

        if (totalSum == number) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
