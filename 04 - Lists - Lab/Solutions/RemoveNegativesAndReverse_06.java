package Lists_Lab;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                                .map(Integer::parseInt).collect(Collectors.toList());
        //numbers = {10, -5, 7, 9, -33, 50}

        //1. премахваме всички отрицателни числа в списъка
        //начин 1: removeIf
        //numbers.removeIf(number -> number < 0);
        //numbers = {10, 7, 9, 50}


        //начин 2:
        List<Integer> positiveNumbers = new ArrayList<>(); //празен списък, в който да съхраняваме само положителни числа
        //numbers = {10, -5, 7, 9, -33, 50}
        for (int number : numbers) {
            if (number > 0) {
                positiveNumbers.add(number);
            }
        }
        //positiveNumbers = {10, 7, 9, 50}

        //2. обръщаме списъка в обратен ред: {10, 7, 9, 50} -> {50, 9, 7, 10}
        Collections.reverse(positiveNumbers);
        //positiveNumbers = {50, 9, 7, 10}

        //3. отпечатване на списъка
        if (positiveNumbers.isEmpty()) {
            //size = 0 -> нямаме елементи в списъка
            System.out.println("empty");
        } else {
            //size != 0 -> имаме елементи в списъка
            for (int number : positiveNumbers) {
                System.out.print(number + " ");
            }
        }
    }
}
