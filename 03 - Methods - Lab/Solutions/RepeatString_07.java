package Methods_Lab;

import java.util.Scanner;

public class RepeatString_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //входни данни
        String textForRepeat = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        //начин 1
        printRepeatedText(textForRepeat, count);

        //начин 2
        //System.out.println(getResultedText(textForRepeat, count));

    }

    //метод, който отпечатва даден текст определен брой пъти
    private static void printRepeatedText(String text, int count) {
        //създава се променлива text = "abc"
        //създава се променлива count = 4
        //text - текстът, който трябва да отпечатаме
        //count - брой пъти, в които трябва да отпечатаме текста
        for (int i = 1; i <= count; i++) {
            System.out.print(text);
        }
    }

    //метод, който връща текст, в който сме добавили нашия текст определен брой пъти
    private static String getResultedText(String text, int count) {
        String resultedText = "";
        for (int i = 1; i <= count; i++) {
            resultedText += text;
        }
        return resultedText;
    }
}
