package Methods_Lab;

import java.util.Scanner;

public class Calculations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //входни данни
        String operation = scanner.nextLine();
        //"add" -> събиране на числата firstNumber + secondNumber
        //"multiply" -> умножаване на числата firstNumber * secondNumber
        //"subtract" -> изваждане на числата firstNumber - secondNumber
        // "divide" -> деление на числата firstNumber / secondNumber
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        printResultFromOperation(operation, firstNumber, secondNumber);
    }

    //метод, който проверява коя е операцията и отпечатва резултата от нея
    private static void printResultFromOperation (String operation, int num1, int num2) {
        //създава се променлива operation = "divide"
        //създава се променлива num1 = 8
        //създава се променлива num2 = 4
        //operation - аритметичната операция
        //num1 - първо число
        //num2 - второ число
        switch (operation) {
            case "add" -> System.out.println(num1 + num2);
            case "multiply" -> System.out.println(num1 * num2);
            case "subtract" -> System.out.println(num1 - num2);
            case "divide" -> System.out.println(num1 / num2);
        }
    }
}
