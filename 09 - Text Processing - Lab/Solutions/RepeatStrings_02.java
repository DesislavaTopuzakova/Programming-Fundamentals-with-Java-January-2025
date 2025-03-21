package TextProcessing_Lab;

import java.util.Scanner;

public class RepeatStrings_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] texts = scanner.nextLine().split(" ");
         //"hi abc add".split(" ") -> ["hi", "abc", "add"]

        for (String text : texts) {
            int length = text.length(); //дължина на текста = брой пъти за отпечатване на текста
            for (int count = 1; count <= length; count++) {
                System.out.print(text);
            }
        }
    }
}
