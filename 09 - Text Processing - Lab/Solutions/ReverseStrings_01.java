package TextProcessing_Lab;

import java.util.Scanner;

public class ReverseStrings_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine(); //входни данни -> дума или "end"

        //while цикъл
        //повтаряме: въвеждаме входни данни
        //стоп: входни данни == "end"
        //продължаваме: входни данни != "end"
        while (!input.equals("end")) {
            //input -> дума
            //input = "hello"

            //взимам думата в обратен ред
            String reversedWord = ""; //обърната дума
            for (int position = input.length() - 1; position >= 0; position--) {
                char currentSymbol = input.charAt(position);
                reversedWord += currentSymbol;
                //reversedWord = reversedWord + currentSymbol;
            }

            //входяща дума -> input
            //обърната дума -> reversedWord
            System.out.println(input + " = " + reversedWord);


            input = scanner.nextLine();
        }

    }
}
