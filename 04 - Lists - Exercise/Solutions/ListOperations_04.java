package Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        //numbers = {1, 23, 29, 18, 43, 21, 20}

        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String[] commandParts = command.split(" ");
            String commandName = commandParts[0]; //"Add", "Insert", "Remove", "Shift"

            switch (commandName) {
                case "Add" -> {
                    //command = "Add 5".split(" ")
                    //commandParts = ["Add", "5"]
                    //add number at the end
                    int numberToAdd = Integer.parseInt(commandParts[1]); //"5" -> 5
                    numbers.add(numberToAdd);
                }

                case "Insert" -> {
                    //command = "Insert 45 1".split(" ")
                    //commandParts = ["Insert", "45", "1"]
                    //insert number at given position
                    int numberForInsertion = Integer.parseInt(commandParts[1]); //"45" -> 45
                    int positionForInsertion = Integer.parseInt(commandParts[2]); //"1" -> 1

                    //проверка дали е валидна позицията
                    //[0; последната позиция]
                    if (positionForInsertion >=  0 && positionForInsertion <= numbers.size() - 1) {
                        //валидна позиция
                        numbers.add(positionForInsertion, numberForInsertion);
                    } else {
                        //невалидна позиция
                        System.out.println("Invalid index");
                    }

                }

                case "Remove" -> {
                    //command = "Remove 2".split(" ")
                    //commandParts = ["Remove", "2"]
                    //remove number on the given position
                    int positionForRemove = Integer.parseInt(commandParts[1]); //"2" -> 2

                    //проверка дали е валидна позицията
                    if (positionForRemove >= 0 && positionForRemove <= numbers.size() - 1) {
                        //валидна позиция
                        numbers.remove(positionForRemove);
                    } else {
                        //невалидна позиция
                        System.out.println("Invalid index");
                    }

                }

                case "Shift" -> {
                    String position = commandParts[1]; //"left", "right"
                    int count = Integer.parseInt(commandParts[2]);

                    if (position.equals("left")) {
                        //command = "Shift left 2".split(" ")
                        //commandParts = ["Shift", "left", "2"]
                        for (int i = 1; i <= count; i++) {
                            //повтаряме: първото число става последно
                            //1. взимаме първото число в списъка
                            int firstNumber = numbers.get(0); //getFirst();
                            //2. махаме първото число от списъка
                            numbers.remove(0);
                            //3. добавям го в края на списъка
                            numbers.add(firstNumber);
                        }
                    } else if (position.equals("right")) {
                        //command = "Shift right 3".split(" ")
                        //commandParts = ["Shift", "right", "3"]
                        for (int i = 1; i <= count ; i++) {
                            //повтаряме: последно число става първо
                            //1. взимаме последното число в списъка
                            int lastNumber = numbers.get(numbers.size() - 1); //getLast();
                            //2. премахваме последното число от списъка
                            numbers.remove(numbers.size() - 1);
                            //3. вмъкваме числото в началото
                            numbers.add(0, lastNumber);
                        }

                    }
                }
            }
            command = scanner.nextLine();
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
