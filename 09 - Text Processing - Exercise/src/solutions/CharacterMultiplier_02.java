package solutions;

import java.util.Scanner;

public class CharacterMultiplier_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        String firstText = input[0];
        String secondText = input[1];

        printSumCharacters(firstText, secondText);
    }

    private static void printSumCharacters(String firstText, String secondText) {

        // трябва да намеря кой е по-дългия и кой е по-късия текст
        //"George" -> length  = 6 -> positions [0 - 5]
        //"Peter" -> length  = 5 -> positions [0 - 4]
        int minLength = Math.min(firstText.length(), secondText.length());//дължината на по-късия текст

        int sum = 0;
        for (int position = 0; position <= minLength - 1; position++) {

            char symbolFirstText = firstText.charAt(position);
            char symbolSecondText = secondText.charAt(position);

            int multiply = symbolFirstText * symbolSecondText;

            sum += multiply;
        }

        //ако имам още символи в някой текст, които не съм обходил
        if (firstText.length() == secondText.length()) {
            //1. ако двата въведени текста са еднакви -> аз съм обходил и умножил всички символи
            System.out.println(sum);
        } else if (firstText.length() > secondText.length()) {
            //2. ако първия текст е подълъг
            //George -> обхождам останалите символи
            for (int position = minLength; position <= firstText.length() - 1; position++) {

                char symbol = firstText.charAt(position);
                sum += symbol;
            }
            //вече имам всички символи обходени и ще ги принтирам
            System.out.println(sum);

        } else if (secondText.length() > firstText.length()) {
            //3. ако втория текст е подълъг
            for (int position = minLength; position <= secondText.length() - 1; position++) {
                char symbol = secondText.charAt(position);
                sum += symbol;
            }
            //вече имам всички символи обходени и ще ги принтирам
            System.out.println(sum);
        }
    }
}
