package Solutions;

import java.util.Scanner;

public class TriplesOfLatinLetters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 97; i < 97 + n; i++) {
            for (int j = 97; j < 97 + n; j++) {
                for (int k = 97; k < 97 + n; k++) {
                    System.out.printf("%c%c%c%n", i, j, k);
                }
            }
        }
        /*for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    char firstChar = (char) ('a' + i);
                    char secondChar = (char) ('a' + j);
                    char thirdChar = (char) ('a' + k);
                    System.out.printf("%c%c%c%n", firstChar, secondChar, thirdChar);
                }
            }
        }*/


    }
}
