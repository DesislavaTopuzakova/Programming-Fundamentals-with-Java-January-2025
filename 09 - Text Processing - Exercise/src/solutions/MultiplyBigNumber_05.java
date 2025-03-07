package solutions;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumber_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger firstNumber = new BigInteger(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        System.out.println(firstNumber.multiply(BigInteger.valueOf(secondNumber)));

/*        firstNumber.add(secondNumber);
        firstNumber.subtract(secondNumber);
        firstNumber.divide(secondNumber);*/
    }
}
