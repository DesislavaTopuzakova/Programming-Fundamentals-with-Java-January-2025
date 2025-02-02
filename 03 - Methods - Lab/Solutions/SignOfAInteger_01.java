package Methods_Lab;

import java.util.Scanner;

public class SignOfAInteger_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        printNumberType(number);
    }

    //метод, който отпечатва вида на числото
    //number > 0 -> The number {number} is positive.
    //number == 0 -> The number {number} is zero.
    //number < 0 -> The number {number} is negative.
    private static void printNumberType (int num) {
        //създава се променлива num = 0
        if (num > 0) {
            System.out.printf("The number %d is positive.", num);
        } else if (num == 0) {
            System.out.printf("The number %d is zero.", num);
        } else {
            //number < 0
            System.out.printf("The number %d is negative.", num);
        }
    }

}
