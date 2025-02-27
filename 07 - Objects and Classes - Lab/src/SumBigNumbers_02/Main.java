package SumBigNumbers_02;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger number1 = new BigInteger(scanner.nextLine());
        BigInteger number2 = new BigInteger(scanner.nextLine());

        System.out.println(number1.add(number2));
    }
}
