import java.util.Scanner;

public class MethodsDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        String name = getName();

        int minNumber = getMinNumber(number1, number2);

    }

    public static String getName() {

        return "Desi";
    }

    private static int getMinNumber(int num1, int num2) {

        return Math.min(num1, num2);
    }
}
