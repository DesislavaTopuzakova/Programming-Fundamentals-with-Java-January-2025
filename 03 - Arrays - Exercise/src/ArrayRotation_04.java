import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int n = Integer.parseInt(scanner.nextLine());

        // създавам фор цикъл за всяко едно завъртане на масива
        for (int iteration = 1; iteration <= n; iteration++) {

            // 1 запазвам първото число от масива
            int firstNum = array[0];

            // 2 създавам вложен фор цикъл, за да извърша разместването на числата наляво
            for (int position = 0; position < array.length - 1; position++) {
                array[position] = array[position + 1];
            }

            // 3 запазвам първото число на последно място
            array[array.length - 1] = firstNum;
        }

        for (int number : array) {
            System.out.print(number + " ");
        }
    }
}
