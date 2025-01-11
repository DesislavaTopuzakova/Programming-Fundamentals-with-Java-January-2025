package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class VendingMachine_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalMoney = 0;
        String input = scanner.nextLine();
        while (!input.equals("Start")) {

            double currentMoney = Double.parseDouble(input);

            if (currentMoney == 0.1 || currentMoney == 0.2 || currentMoney == 0.5 || currentMoney == 1 || currentMoney == 2) {
                totalMoney += currentMoney;
            } else {
                System.out.printf("Cannot accept %.2f%n", currentMoney);
            }

            input = scanner.nextLine();
        }

        String command = scanner.nextLine();
        while (!command.equals("End")) {

            double productPrice = 0;
            switch (command) {
                case "Nuts":
                    productPrice = 2.0;
                    break;
                case "Water":
                    productPrice = 0.7;
                    break;
                case "Crisps":
                    productPrice = 1.5;
                    break;
                case "Soda":
                    productPrice = 0.8;
                    break;
                case "Coke":
                    productPrice = 1.0;
                    break;
                default:
                    System.out.println("Invalid product");
                    command = scanner.nextLine();
                    continue;
            }

            if (totalMoney >= productPrice) {
                System.out.printf("Purchased %s%n", command);
                totalMoney -= productPrice;
            } else {
                System.out.println("Sorry, not enough money");
            }

            command = scanner.nextLine();
        }

        System.out.printf("Change: %.2f", totalMoney);
    }
}
