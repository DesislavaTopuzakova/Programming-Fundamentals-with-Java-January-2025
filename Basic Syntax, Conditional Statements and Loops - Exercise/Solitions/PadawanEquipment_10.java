package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class PadawanEquipment_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double saberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        double sabersSum = saberPrice * (students + Math.ceil(students * 0.10));
        double robesSum = robePrice * students;
        double beltsSum = beltPrice * (students - (students / 6));

        double moneyNeeded = sabersSum + robesSum + beltsSum;

        if (budget >= moneyNeeded) {
            System.out.printf("The money is enough - it would cost %.2flv.", moneyNeeded);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", moneyNeeded - budget);
        }
    }
}
