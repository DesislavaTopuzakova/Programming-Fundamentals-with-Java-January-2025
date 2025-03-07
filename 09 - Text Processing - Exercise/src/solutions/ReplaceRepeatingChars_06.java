package solutions;

import java.util.Scanner;

public class ReplaceRepeatingChars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuffer word = new StringBuffer();

        //взимам първия чар от стринга който съм прочел, защото знам, че няма как да съм го срещал преди
        word.append(input.charAt(0));

        //обхождам входните данни от позиция 1, а не от позиция 0 защото е излишно
        for (int position = 1; position < input.length(); position++) {

            //ако сегашния чар е разлиен от предния, ще го добавя в стринг билдъра
            if (input.charAt(position) != (input.charAt(position - 1))) {
                word.append(input.charAt(position));
            }
        }

        System.out.println(word);
    }
}
