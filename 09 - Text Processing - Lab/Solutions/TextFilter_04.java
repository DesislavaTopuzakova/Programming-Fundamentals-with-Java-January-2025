package TextProcessing_Lab;

import java.util.Scanner;

public class TextFilter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] forbiddenWords = scanner.nextLine().split(", ");
        //"Linux, Windows".split(", ") -> ["Linux", "Windows"]
        String text = scanner.nextLine();

        //трябва да заменим всяка забранена дума в текста
        for (String forbiddenWord : forbiddenWords) {
            //forbiddenWord = "Linux" -> "*****"
            String replacement = "*".repeat(forbiddenWord.length());
            text = text.replace(forbiddenWord, replacement);
        }

        System.out.println(text);

    }
}
