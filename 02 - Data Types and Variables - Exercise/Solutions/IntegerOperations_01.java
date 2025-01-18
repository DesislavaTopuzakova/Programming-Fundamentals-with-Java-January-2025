package Solutions;

import java.util.Scanner;

public class IntegerOperations_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        int forth = Integer.parseInt(scanner.nextLine());

        int result = ((first + second) / third) * forth;

        System.out.println(result);
    }
}
