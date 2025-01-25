import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int position = 0; position <= array.length - 1; position++) {

            // правя проверка дали чослото е последно от масива
            if (position == array.length - 1) {
                System.out.println(array[position]);
                break;
            }

            // запазвам сегашното число
            int currentNum = array[position];

            boolean isTopInteger = true;
            for (int nextPosition = position + 1; nextPosition <= array.length - 1; nextPosition++) {

                // взимам следващото число
                int nextNumber = array[nextPosition];

                //правя проверка дали следващото е по-голямо, ако да, слагам брейк на следващите итерации
                if (nextNumber >= currentNum) {
                    isTopInteger = false;
                    break;
                }
            }
            //ако числото е топ, го принтирам
            if (isTopInteger) {
                System.out.print(currentNum + " ");
            }
        }
    }
}
