package Arrays_Lab;

import java.util.Scanner;

public class ReverseAnArrayOfStrings_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. прочитаме масив от текстове
        String[] texts = scanner.nextLine().split(" ");
                        //"a b c d e".split(" ") -> ["a", "b", "c", "d", "e"]

        //2. отпечатваме въведения масив в обратен ред
        for (int position = texts.length - 1; position >= 0; position--) {
            System.out.print(texts[position] + " ");
        }
    }
}
