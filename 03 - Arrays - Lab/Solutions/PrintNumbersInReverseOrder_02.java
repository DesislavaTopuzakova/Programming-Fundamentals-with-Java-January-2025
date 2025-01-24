package Arrays_Lab;

import java.util.Scanner;

public class PrintNumbersInReverseOrder_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine()); //брой на числата, с които ще работим

        //1. съхраняваме числата, които ще се въведат в масив
        int [] numbers = new int[count];
        for (int position = 0; position <= numbers.length - 1; position++) {
            numbers[position] = Integer.parseInt(scanner.nextLine());
        }

        //2. оптечатваме ги в обратен ред
        //numbers = [10, 20, 30]
        //обратен ред: последната позиция до първата
        for (int position = numbers.length - 1; position >= 0; position--) {
            System.out.print(numbers[position] + " ");
        }
    }
}
