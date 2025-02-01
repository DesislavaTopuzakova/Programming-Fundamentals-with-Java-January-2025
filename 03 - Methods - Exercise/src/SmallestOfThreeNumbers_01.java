import java.util.Scanner;

public class SmallestOfThreeNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        printSmallestNumber(firstNumber, secondNumber, thirdNumber);
    }

    public static void printSmallestNumber(int firstNumber, int secondNumber, int thirdNumber) {

        int minNumber = Integer.MAX_VALUE;

        if (firstNumber < minNumber) {
            minNumber = firstNumber;
        }
        if (secondNumber < minNumber) {
            minNumber = secondNumber;
        }
        if (thirdNumber < minNumber) {
            minNumber = thirdNumber;
        }

        System.out.println(minNumber);
    }
}
