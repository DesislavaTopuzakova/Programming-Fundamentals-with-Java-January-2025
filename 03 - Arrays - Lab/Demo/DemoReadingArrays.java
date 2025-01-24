package Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class DemoReadingArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //четене на масив от текстове
        String [] names = scanner.nextLine().split(" ");
        //"Ivan Georgi Peter".split(" ") -> ["Ivan", "Georgi", "Peter"]

        //четене на масив от цели числа
        int [] numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        //четене на масив от дробни числа
        double [] prices = Arrays.stream(scanner.nextLine()
                        .split(" "))
                         .mapToDouble(Double::parseDouble)
                            .toArray();
    }
}
