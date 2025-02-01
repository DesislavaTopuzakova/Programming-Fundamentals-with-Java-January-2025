import java.util.Scanner;

public class AddAndSubtract_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        int sumNumbers = sum(firstNumber, secondNumber);
        int result = subtract(sumNumbers, thirdNumber);

        System.out.println(result);
    }

    public static int sum(int firstNumber, int secondNumber) {

        return firstNumber + secondNumber;
    }

    public static int subtract(int sumNumbers, int thirdNumber) {

        return  sumNumbers - thirdNumber;
    }
}
