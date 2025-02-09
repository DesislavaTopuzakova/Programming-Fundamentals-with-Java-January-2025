package Lists_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                                .map(Integer::parseInt)
                                .collect(Collectors.toList());
        //numbers = {4, 19, 2, 53, 6, 43}

        //while цикъл
        //повтаряме: въвеждане на команда
        //стоп: команда = "end"
        //продължаваме: команда != "end"

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            //проверяваме кой вид команда е въведена
            if (command.contains("Add")) {
                //command = "Add 4".split(" ") -> ["Add", "4"]
                int numberToAdd = Integer.parseInt(command.split(" ")[1]);
                numbers.add(numberToAdd);
            } else if (command.contains("RemoveAt")) {
                //command = "RemoveAt 0".split(" ") -> ["RemoveAt", "0"]
                int positionToRemove = Integer.parseInt(command.split(" ")[1]);
                numbers.remove(positionToRemove); //премахваме елемент от дадена позиция
            } else if (command.contains("Remove")) {
                //command = "Remove 89".split(" ") -> ["Remove", "89"]
                int numberToRemove = Integer.parseInt(command.split(" ")[1]);
                numbers.remove(Integer.valueOf(numberToRemove)); //премахваме елемент от списъка
            } else if (command.contains("Insert")) {
                //command = "Insert 34 1".split(" ") -> ["Insert", "34", "1"]
                int numberToInsert = Integer.parseInt(command.split(" ")[1]); //"34" -> 34
                int positionToInsert = Integer.parseInt(command.split(" ")[2]); //"1" -> 1
                numbers.add(positionToInsert, numberToInsert);
            }
            command = scanner.nextLine();
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }


    }
}
