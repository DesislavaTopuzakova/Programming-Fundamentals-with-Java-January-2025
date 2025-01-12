package Solitions;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String peopleType = scanner.nextLine();
        String day = scanner.nextLine();

        double pricePerDay = 0;

        if (peopleType.equals("Students")) {
            if (day.equals("Friday")) {
                pricePerDay = 8.45;
            } else if (day.equals("Saturday")) {
                pricePerDay = 9.80;
            } else if (day.equals("Sunday")) {
                pricePerDay = 10.46;
            }
        } else if (peopleType.equals("Business")) {
            if (day.equals("Friday")) {
                pricePerDay = 10.90;
            } else if (day.equals("Saturday")) {
                pricePerDay = 15.60;
            } else if (day.equals("Sunday")) {
                pricePerDay = 16;
            }
        } else if (peopleType.equals("Regular")) {
            if (day.equals("Friday")) {
                pricePerDay = 15;
            } else if (day.equals("Saturday")) {
                pricePerDay = 20;
            } else if (day.equals("Sunday")) {
                pricePerDay = 22.50;
            }
        }

        double totalPrice = pricePerDay * people;

        if (peopleType.equals("Students") && people >= 30) {
            totalPrice = totalPrice * 0.85;
        } else if (peopleType.equals("Business") && people >= 100) {
            totalPrice = (people - 10) * pricePerDay;
        } else  if (peopleType.equals("Regular") && people >= 10 && people <= 20) {
            totalPrice = totalPrice - totalPrice * 0.05;
        }

        System.out.printf("Total price: %.2f", totalPrice);
    }
}
