package MidExamPrep1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //списък с артикули
        List<String> itemsList = Arrays.stream(scanner.nextLine() //"Iron, Wood, Sword"
                                .split(", "))  //["Iron", "Wood", "Sword"]
                                .collect(Collectors.toList()); //{"Iron", "Wood", "Sword"}


        //повтаряме: въвеждане на текстови команди
        //стоп: въведената команда == "Craft!"
        //продължаваме: въведената команда != "Craft!"

        String command = scanner.nextLine();
        while (!command.equals("Craft!")) {
            //проверяваме коя точно команда е въведена
            if (command.contains("Collect")) {
                //command = "Collect - Iron".split(" - ") -> ["Collect", "Iron"]
                String itemToAdd = command.split(" - ")[1];
                if (!itemsList.contains(itemToAdd)) {
                    itemsList.add(itemToAdd);
                }
            } else if (command.contains("Drop")) {
                //command = "Drop - Iron".split(" - ") -> ["Drop", "Iron"]
                String itemToDrop = command.split(" - ")[1];
                itemsList.remove(itemToDrop);
                //вграден метод remove
                //1. проверява дали елементът го има в списъка
                //2. ако го има в списъка -> премахва го
            } else if (command.contains("Combine Items")) {
                //command = "Combine Items - {item}:{new_item}".split(" - ")
                //["Combine Items", "{item}:{new_item}"]
                String oldItem = command.split(" - ")[1].split(":")[0]; //"{item}:{new_item}".split(":) -> ["{item}", "{new_item}"]
                String newItem = command.split(" - ")[1].split(":")[1]; //"{item}:{new_item}".split(":) -> ["{item}", "{new_item}"]
                if (itemsList.contains(oldItem)) {
                    int positionOldItem = itemsList.indexOf(oldItem);
                    itemsList.add(positionOldItem + 1, newItem);
                }

            } else if (command.contains("Renew")) {
                //command = "Renew – Iron".split(" - ") -> ["Renew", "Iron"]
                String itemToRenew = command.split(" - ")[1];
                if (itemsList.contains(itemToRenew)) {
                    itemsList.remove(itemToRenew);
                    itemsList.add(itemToRenew);
                }
            }
            command = scanner.nextLine();
        }

        //отпечатваме артикулите в списъка разделени със запетая и интервал
        System.out.println(String.join(", ", itemsList));
    }
}
