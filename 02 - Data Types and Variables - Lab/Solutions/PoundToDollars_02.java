package DataTypesAndVariables_Lab;

import java.util.Scanner;

public class PoundToDollars_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pounds = Double.parseDouble(scanner.nextLine());

        //usd = pounds * 1.36
        double usd = pounds * 1.36;

        System.out.printf("%.3f", usd);
    }
}
