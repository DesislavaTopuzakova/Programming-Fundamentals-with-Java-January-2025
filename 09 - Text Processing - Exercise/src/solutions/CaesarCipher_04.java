package solutions;

import java.util.Scanner;

public class CaesarCipher_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder result = new StringBuilder();
        //криптиране
        for (char symbol : input.toCharArray()) {

            //symbol = 'A' -> encryptedSymbol = 'D'
            char encryptedSymbol = (char) (symbol + 3);
            result.append(encryptedSymbol);
        }

        System.out.println(result);
    }
}
