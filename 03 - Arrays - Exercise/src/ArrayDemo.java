import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Масив от цели числа
//        int[] numbers = new int[3];
//        numbers[0] = 2;
//        numbers[1] = 4;
//        numbers[2] = 10;
//        System.out.println();

        // Прочитаме Стринг масив от конзолата
        // Пример : "Plovdiv Varna Sofia"
//        String[] towns = scanner.nextLine().split(" ");
//
//        for (String town : towns) {
//            System.out.print(town + " ");
//        }

        // "1 4 5 6 7" ->.split(" ") -> ["1","4","5","6","7"]
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt) //[1,4,5,6,7]
                .toArray();

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
