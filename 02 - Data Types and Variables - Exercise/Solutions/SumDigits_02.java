package Solutions;

import java.util.Scanner;

public class SumDigits_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        // докато числото ми е по-голямо от 0
        while (number > 0) {

            //езимам последната цигра от едно число като го деля модулно на 10
            int lastDigit = number % 10;

            //сумирам
            sum += lastDigit;

            //премахвам последната цифра от числото
            number = number / 10;
        }

        System.out.println(sum);
    }
}
