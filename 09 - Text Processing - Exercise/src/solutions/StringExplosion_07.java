package solutions;

import java.util.Scanner;

public class StringExplosion_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //String input = scanner.nextLine();

        //запазвам входа в стринг гилдъл за да не извършвам тежки операции със стринг
        StringBuilder textBuilder = new StringBuilder(scanner.nextLine());

        int totalPower = 0;
        for (int position = 0; position < textBuilder.length(); position++) {

            char currentSymbol = textBuilder.charAt(position);

            //проверявам дали имам експлозия
            if (currentSymbol == '>') {
                //взимам сегашната сила
                int power = Integer.parseInt(textBuilder.charAt(position + 1) + "");
                //прибавям сегашната сила в обща променлива, която ми пази общата сила
                totalPower += power;

                //правя проверка дали имам сила за премахване на елементи от стринга
            } else if (totalPower > 0) {
                textBuilder.deleteCharAt(position);
                totalPower--;

                //връщам се с една позиция назад
                position--;
            }
        }

        System.out.println(textBuilder);
    }
}
