package Arrays_Lab;

import java.util.Scanner;

public class DayOfWeek_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dayNumber = Integer.parseInt(scanner.nextLine());

        //1 -> "Monday"
        //2 -> "Tuesday"
        //3 -> "Wednesday"
        //4 -> "Thursday"
        //5 -> "Friday"
        //6 -> "Saturday"
        //7 -> "Sunday"
        //other outside [1; 7] -> "Invalid day!"

        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if (dayNumber >= 1 && dayNumber <= 7) {
            //отпечатваме деня на текущия номер
            System.out.println(daysOfWeek[dayNumber - 1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}
