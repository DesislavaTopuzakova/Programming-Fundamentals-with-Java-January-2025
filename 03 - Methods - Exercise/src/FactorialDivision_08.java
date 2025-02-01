import java.util.Scanner;

public class FactorialDivision_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        // създавам метод който изчислява факториела на една число
        long firstFactorial = calculateFactorial(firstNumber);
        long secondFactorial = calculateFactorial(secondNumber);

        double result = firstFactorial  * 1.0 / secondFactorial;

        System.out.printf("%.2f", result);
    }

    public static long calculateFactorial(int number) {

        // 5! = 1 * 2 * 3 * 4 * 5 = 120
        long factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial = factorial * i;
        }

        return factorial;
    }

}
