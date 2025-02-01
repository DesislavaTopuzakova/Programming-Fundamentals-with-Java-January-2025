import java.util.Scanner;

public class MiddleCharacters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        printMiddleCharacter(input);
    }

    private static void printMiddleCharacter(String text) {

        // aString -> 'r' -> index 3 -> length 7
        // Car -> 'a' -> index 1 -> length 3
        // Carts -> 'r' -> index 2 -> 5

        // взимам дължината на текста
        int length = text.length();
        // деля целочислено на 2 дължината за да намеря индекса на чара в средата на текста
        int index = length / 2;

        if (length % 2 == 0) {
            char first = text.charAt(index);
            char second = text.charAt(index - 1);
            System.out.println("" + second + first);
        } else {
            char symbol = text.charAt(index);
            System.out.println("" + symbol);
        }
    }
}
