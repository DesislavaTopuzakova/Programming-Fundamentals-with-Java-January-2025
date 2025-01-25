import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String input = scanner.nextLine();
        while (!input.equals("end")) {

            // взимам командата която ще трянва да извърша
            String command = input.split(" ")[0];

            if (command.equals("swap")) {
                // взимам първия индекс
                int firstIndex = Integer.parseInt(input.split(" ")[1]);
                // взимам втория индекс
                int secondIndex = Integer.parseInt(input.split(" ")[2]);

                // взимам числата по техния индекс
                int firstElement = array[firstIndex];
                int secondElement = array[secondIndex];

                // разменям числата
                array[firstIndex] = secondElement;
                array[secondIndex] = firstElement;
            } else if (command.equals("multiply")) {
                // взимам първия индекс
                int firstIndex = Integer.parseInt(input.split(" ")[1]);
                // взимам втория индекс
                int secondIndex = Integer.parseInt(input.split(" ")[2]);

                // намира резултата като умножа елементите достъпвайки ги по тегните позиции
                int multiply = array[firstIndex] * array[secondIndex];

                array[firstIndex] = multiply;
            } else if (command.equals("decrease")) {
                for (int i = 0; i <= array.length - 1; i++) {
                    array[i]--;
                }
            }

            input = scanner.nextLine();
        }

        for (int i = 0; i <= array.length - 1; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
    }
}
