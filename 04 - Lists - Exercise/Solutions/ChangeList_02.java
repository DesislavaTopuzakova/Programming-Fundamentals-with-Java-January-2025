package Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                                .map(Integer::parseInt).collect(Collectors.toList());

        //numbers = {1, 2, 3, 4, 5, 5, 5, 6}
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            if (command.contains("Delete")) {
                //command = "Delete 5".split(" ") -> ["Delete", "5"]
                int numberForDelete = Integer.parseInt(command.split(" ")[1]); //"5" -> 5
                numbers.removeAll(List.of(numberForDelete));
                //numbers = {1, 2, 3, 4, 6}
            } else if (command.contains("Insert")) {
                //command = "Insert 34 2".split(" ") -> ["Insert", "34", "2"]
                int numberForInsertion = Integer.parseInt(command.split(" ")[1]); //"34" -> 34
                int position = Integer.parseInt(command.split(" ")[2]); //"2" -> 2
                 numbers.add(position, numberForInsertion);
                //numbers = {1, 2, 34, 3, 4, 5, 5, 5, 6}
            }

            command = scanner.nextLine();
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
