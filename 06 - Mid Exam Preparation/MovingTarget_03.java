package MidExamPrep2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //"52 74 23 44 96 110" -> {52, 74, 23, 44, 96, 110}
        List<Integer> targets = Arrays.stream(scanner.nextLine().split(" "))
                                .map(Integer::parseInt)
                                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String[] commandParts = command.split(" ");
            String commandName = commandParts[0]; //"Shoot", "Add", "Strike"
            int position = Integer.parseInt(commandParts[1]); //"1" -> 1

            switch (commandName) {
                case "Shoot" -> {
                    //command = "Shoot 1 30".split(" ")
                    //commandParts = ["Shoot", "1", "30"]
                    int power = Integer.parseInt(commandParts[2]); //сила на стрелбата

                    //проверяваме дали позицията е валидна -> стреляме
                    if (position >= 0 && position <= targets.size() - 1) {
                        //имаме разрешение за стрелба
                        int shotTarget = targets.get(position); //стойността на мишената, която ще стреляме

                        //стреляме
                        shotTarget -= power;

                        //проверка след стрелбата
                        if(shotTarget <= 0) {
                            targets.remove(position);
                        } else {
                            targets.set(position, shotTarget);
                        }
                    }
                }

                case "Add" -> {
                    //command = "Add 2 90"
                    //commandParts = ["Add", "2", "90"]
                    int value = Integer.parseInt(commandParts[2]);
                    //проверка на позицията
                    if (position >= 0 && position <= targets.size() - 1) {
                        targets.add(position, value);
                    } else {
                        //невалидна позиция
                        System.out.println("Invalid placement!");
                    }
                }

                case "Strike" -> {
                    //command = "Strike 2 4"
                    //commandParts = ["Strike", "2", "4"]
                    int radius = Integer.parseInt(commandParts[2]);

                    //проверка дали е валидна позицията
                    if (position - radius >= 0 && position + radius <= targets.size() - 1) {
                        //subList().clear() -> премахва подсписъка от главния списък
                        targets.subList(position - radius, position + radius + 1).clear();
                    } else {
                        System.out.println("Strike missed!");
                    }
                }
            }

            command = scanner.nextLine();
        }

        //отпечатваме елементите на списъка разделени с |
        //targets = {52, 74, 23, 44, 96, 110}
        System.out.println(targets.toString() //"[52, 74, 23, 44, 96, 110]"
                            .replace("[", "") //"52, 74, 23, 44, 96, 110]"
                            .replace("]", "") //"52, 74, 23, 44, 96, 110"
                            .replaceAll(", ", "|")); //"52|74|23|44|96|110"
    }
}
