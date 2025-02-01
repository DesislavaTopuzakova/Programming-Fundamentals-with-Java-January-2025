import java.util.Scanner;

public class PalindromeIntegers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {

            boolean isPalindrome = validatePalindrome(input);

            System.out.println(isPalindrome);

            input = scanner.nextLine();
        }
    }

    public static boolean validatePalindrome(String text) {

        String reversed = "";

        // обхождам стринга отзад напред
        for (int i = text.length() - 1; i >= 0; i--) {

            reversed += text.charAt(i);
        }

        return reversed.equals(text);
    }
}
