package DataTypesAndVariables_Lab;

import java.util.Scanner;

public class CharsToString_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //входни данни
        char firstSymbol = scanner.nextLine().charAt(0);
        char secondSymbol = scanner.nextLine().charAt(0);
        char thirdSymbol = scanner.nextLine().charAt(0);

        //начин 1: с форматиран текст
        System.out.printf("%c%c%c", firstSymbol, secondSymbol, thirdSymbol);

        //начин 2: долепяне на символи
        String output = "" + firstSymbol + secondSymbol + thirdSymbol;
        System.out.println(output);
    }
}
