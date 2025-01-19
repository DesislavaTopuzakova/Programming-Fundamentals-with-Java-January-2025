package DataTypesAndVariables_Lab;

import java.util.Scanner;

public class ConcatNames_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //входни данни
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        String delimiter = scanner.nextLine();

        //отпечатваме
        String output = firstName + delimiter + lastName;
        System.out.println(output);

    }
}
