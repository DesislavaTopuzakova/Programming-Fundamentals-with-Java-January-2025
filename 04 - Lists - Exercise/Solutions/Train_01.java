package Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" "))
                                .map(Integer::parseInt).collect(Collectors.toList());

        //{32, 54, 21, 12, 4, 0, 23}

        int maxCapacity = Integer.parseInt(scanner.nextLine()); //макс брой хора във всеки вагон

        //повтаряме: въвеждаме команда
        //стоп: команда == "end"
        //продължаваме: команда != "end"
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            if (command.contains("Add")) {
                //1. command = "Add 12".split(" ") -> ["Add", "12"]
                //добавяме числото в края на списъка
                int count = Integer.parseInt(command.split(" ")[1]);
                wagons.add(count);
                //{32, 54, 21, 12, 4, 0, 23, 12}
            } else {
                //2. command = "23"
                int passengers = Integer.parseInt(command); //бр. хората, които да добавим в някой вагон
                //"23" -> 23
                //maxCapacity = 75
                //{32, 54, 21, 12, 4, 0, 23, 12}
                for (int wagon = 0; wagon <= wagons.size() - 1; wagon++) {
                    int currentPassengersInWagon = wagons.get(wagon);
                    //проверка: мога ли да кача хората в текущия вагон
                    if (currentPassengersInWagon + passengers <= maxCapacity) {
                        //качвам хората в текущия вагон
                        wagons.set(wagon, currentPassengersInWagon + passengers);
                        break;
                    }
                }
            }

            command = scanner.nextLine();
        }

        for (int number : wagons) {
            System.out.print(number + " ");
        }
    }
}
