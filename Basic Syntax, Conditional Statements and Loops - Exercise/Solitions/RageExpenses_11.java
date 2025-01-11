package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class RageExpenses_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int headsetTrashTimes = 0;
        int mouseTrashTimes = 0;
        int keyboardTrashTimes = 0;
        int displayTrashTime = 0;

        for (int i = 1; i <= lostGames ; i++) {

            if (i % 2 == 0) {
                headsetTrashTimes++;
            }

            if (i % 3 == 0) {
                mouseTrashTimes++;
            }

            if (i % 6 == 0) {
                keyboardTrashTimes++;
            }

            if (i % 12 == 0) {
                displayTrashTime++;
            }
        }

        double totalPrice = (headsetPrice * headsetTrashTimes)
                + (mousePrice * mouseTrashTimes)
                + (keyboardPrice * keyboardTrashTimes)
                + (displayPrice * displayTrashTime);

        System.out.printf("Rage expenses: %.2f lv.", totalPrice);
    }
}
