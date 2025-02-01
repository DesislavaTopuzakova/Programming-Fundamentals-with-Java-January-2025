import java.util.Scanner;

public class TopNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int number = 1; number <= n; number++) {

            // 1 - проверявам дали сбора на цифрите от числото се дели на 8
            boolean isDivisibleBy8 = validateDivisibleBy8(number);
            // 2 - проверявам дали числото има поне една нечетна цифра
            boolean containsOddDigit = validateOddDigit(number);

            if (isDivisibleBy8 && containsOddDigit) {
                System.out.println(number);
            }

        }
    }

    private static boolean validateDivisibleBy8(int num) {

        int sum = 0;
        while (num > 0) {
            // 1 - взимам последната цифра
            int lastDigit = num % 10;
            // 2 - прибавям цифрата към sum
            sum += lastDigit;
            // 3 - премахвам последната цифра от числот
            num = num / 10; // num /= 10;
        }

        return sum % 8 == 0;
    }

    private static boolean validateOddDigit(int num) {

        while (num > 0) {
            // 1 - взимам последната цифра
            int lastDigit = num % 10;
            // 2 - прравя проверка дали е нечетна цифра
            if (lastDigit % 2 != 0) {
                // ако е нечетна цифра връщам true
                return true;
            }
            // 3 - премахвам последната цифра от числот
            num = num / 10;
        }

        return false;
    }
}
