package Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. прочитаме масив от цели числа
        //scanner.nextLine() -> "1 2 3 4 5 6"
        //scanner.nextLine().split(" ") -> ["1", "2", "3", "4", "5", "6"]
        //Arrays.stream(scanner.nextLine().split(" ")) -> дава възможност да модифицираме лесно масива в скобите
        //mapToInt(Integer::parseInt) -> извършвам действието в скобите върху всички елементи
        //["1", "2", "3", "4", "5", "6"] -> [1, 2, 3, 4, 5, 6]
        int [] numbers = Arrays.stream(scanner.nextLine()
                                        .split(" "))
                                        .mapToInt(Integer::parseInt)
                                        .toArray();


        //numbers = [1, 2, 3, 4, 5, 6]
        //2. сумираме четните числа в масива
        int sumEven = 0; //сума на четните числа в масива

        //обхождаме всички числа в масива с foreach, защото няма да работим с позициите на числата
        for (int number : numbers) {
            //какво правим с всяко число в масива
            if (number % 2 == 0) {
                //number е четно число
                sumEven += number;
            }
        }

        //обходили всички елементи
        System.out.println(sumEven);
    }
}
