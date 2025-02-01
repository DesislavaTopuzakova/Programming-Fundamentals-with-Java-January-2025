import java.util.Scanner;

public class CharactersInRange_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char symbol1 = scanner.nextLine().charAt(0);
        char symbol2 = scanner.nextLine().charAt(0);

        printCharactersInRange(symbol1, symbol2);
    }

    public static void printCharactersInRange(char firstChar, char secondChar) {

        if (firstChar < secondChar) {
            for (int asciiValue = firstChar + 1; asciiValue < secondChar; asciiValue++) {
                System.out.print((char) asciiValue + " ");
            }
        } else {
            for (int asciiValue = secondChar + 1; asciiValue < firstChar; asciiValue++) {
                System.out.print((char) asciiValue + " ");
            }
        }

    }
}
