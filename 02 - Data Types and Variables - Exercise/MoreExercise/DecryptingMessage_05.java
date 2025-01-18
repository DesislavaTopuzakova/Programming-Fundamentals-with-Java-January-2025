package MoreExercise;

import java.util.Scanner;

public class DecryptingMessage_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());// ключ който ми се дава от конзолата
        int n = Integer.parseInt(scanner.nextLine());// чарове които трябва да прочета

        String message = "";
        // използвам фор цикъл за прочитането на всеки един чар
        for (int i = 1; i <= n; i++) {
            //прочитам чар
            char symbol = scanner.nextLine().charAt(0);

            // взимам числената стойност на декрипнатия символ като го събера с ключа
            int decryptedSymbol = symbol + key;

            // конкатенирам резултата
            message = message + (char) decryptedSymbol;
        }

        System.out.println(message);


    }
}
