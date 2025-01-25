import java.util.Arrays;
import java.util.Scanner;

public class EqualSums_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean isFound = false;
        // обхождам масива за да проверя всяко едно число
        for (int position = 0; position < array.length; position++) {

            if (array.length == 1) {
                System.out.println(0);
                break;
            }

            int leftSum = 0;
            int rightSum = 0;
            
            //взимам всички леви числа
            for (int leftPosition = 0; leftPosition < position; leftPosition++) {
                leftSum += array[leftPosition];
            }
            //взимам всички десни числа
            for (int rightPosition = position + 1; rightPosition <= array.length - 1; rightPosition++) {
                rightSum += array[rightPosition];
            }

            if (leftSum == rightSum) {
                System.out.println(position);
                isFound = true;
                break;
            }
        }

        if (!isFound && array.length > 1) {
            System.out.println("no");
        }

    }
}
