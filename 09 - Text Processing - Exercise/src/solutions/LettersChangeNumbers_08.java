package solutions;

import java.util.Scanner;

public class LettersChangeNumbers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //"P34562Z q2576f   H456z"
        String[] codes = scanner.nextLine().split("\\s+");


        double sum = 0;
        for (String code : codes) {

            //намирам резултата на кода
            double result = calculateCodeResult(code);

            sum += result;
        }

        System.out.printf("%.2f", sum);
    }

    private static double calculateCodeResult(String code) {

        char letterBefore = code.charAt(0);
        double number = Double.parseDouble(code.substring(1, code.length() - 1));
        char letterAfter = code.charAt(code.length() - 1);

        //1. First, you start with the letter before the number.
        //•	If it's uppercase, you divide the number by the letter's position in the alphabet.
        if (Character.isUpperCase(letterBefore)) {
            number = number / (letterBefore - 64);
        } else {
            //•	If it's lowercase, you multiply the number with the letter's position in the alphabet
            number = number * (letterBefore - 96);
        }

        //2. Then you move to the letter after the number.
        if (Character.isUpperCase(letterAfter)) {
            //•	If it's uppercase, you subtract its position from the resulted number.
            number = number - (letterAfter - 64);
        } else {
            //•	If it's lowercase, you add its position to the resulted number.
            number = number + (letterAfter - 96);
        }

        return number;
    }
}
