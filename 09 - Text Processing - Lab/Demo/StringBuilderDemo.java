package TextProcessing_Lab;

import java.util.Scanner;

public class StringBuilderDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //StringBuilder = пространство, в което си изграждаме текст

        //създаване на празен StringBuilder
        StringBuilder sb = new StringBuilder(); //нов празен StringBuilder
        //създаване на пълен StringBuilder
        StringBuilder builder = new StringBuilder("Hello, Java");
        StringBuilder sb2 = new StringBuilder(scanner.nextLine());

        //добавяне на текст в StringBuilder
        sb.append("I AM ");
        sb.append(26);
        sb.append(" YEARS OLD.");

        String textInBuilder = sb.toString(); //достъпваме текста в StringBuilder-а
        System.out.println(sb); //отпечатва текста в StringBuilder

        //дължина на текст в StringBuilder = броя на символите в текста в StringBuilder
        System.out.println(sb.length());

        //изчистваме StringBuilder -> премахваме текста вътре
        sb.setLength(0);

        //достъпваме символ от текста в StringBuilder
        System.out.println(sb.charAt(0)); //първия символ в текста в StringBuilder

        //вмъквате текст във вече съществуващ
        sb.insert(0, "Desislava");

        //премахваме текст от вече съществуващ
        sb.delete(0, 3);


    }
}
