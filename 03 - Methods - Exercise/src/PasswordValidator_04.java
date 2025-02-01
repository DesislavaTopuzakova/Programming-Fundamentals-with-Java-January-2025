import java.util.Scanner;

public class PasswordValidator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        // 1 проверявам дали дължината на паролата е между 6 - 10
        boolean isLengthValid = validateLength(password);
        if (!isLengthValid) {
            System.out.println("Password must be between 6 and 10 characters");
        }

        // 2 проверявам дали паролата се състои само от букви и цифри
        boolean containsCharactersAndLetters = validateCharacters(password);
        if (!containsCharactersAndLetters) {
            System.out.println("Password must consist only of letters and digits");
        }

        // 3 проверявам дали паролата има поне 2 цифри
        boolean containsAtLeast2Digits = validateDigits(password);
        if (!containsAtLeast2Digits) {
            System.out.println("Password must have at least 2 digits");
        }


        if (isLengthValid && containsAtLeast2Digits && containsCharactersAndLetters) {
            System.out.println("Password is valid");
        }
    }

    private static boolean validateLength(String input) {

        return input.length() >= 6 && input.length() <= 10;
    }

    private static boolean validateCharacters(String input) {

        // превръщаме един стринг в масив от символи
        for (char symbol : input.toCharArray()) {
            // извикваме класа Character и метода който проверява дали един символ е буква или цифра
            if (!Character.isLetterOrDigit(symbol)) {
                return false;
            }
        }

        return true;
    }

    private static boolean validateDigits(String input) {

        int count = 0;
        for (int i = 0; i < input.length(); i++) {

            if (Character.isDigit(input.charAt(i))) {
                count++;
            }
        }

        return count >= 2;
    }
}
