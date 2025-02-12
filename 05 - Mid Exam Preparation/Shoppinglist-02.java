package MidExamPrep1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //списък с продукти
        List<String> productsList = Arrays.stream(scanner.nextLine() //"Milk!Pepper!Salt!Water!Banana"
                                    .split("!"))  //["Milk", "Pepper", "Salt", "Water", "Banana"]
                                    .collect(Collectors.toList()); // {"Milk", "Pepper", "Salt", "Water", "Banana"}

        //повтаряме: въвеждаме текстови команди
        //стоп: въведената команда == "Go Shopping!"
        //продължаваме: въведената команда != "Go Shopping!"

        String command = scanner.nextLine();
        while (!command.equals("Go Shopping!")) {
            String [] commandParts = command.split(" ");
            String commandName = commandParts[0]; //"Urgent", "Unnecessary", "Correct", "Rearrange"
            String item = commandParts[1]; //продукта, от списъка, с който ще работим

            switch (commandName) {
                case "Urgent" -> {
                   // command = "Urgent {item}".split(" ") -> commandParts = ["Urgent", "{item}"]
                    if (!productsList.contains(item)) {
                        productsList.add(0, item);
                    }
                }

                case "Unnecessary" -> {
                    //command = "Unnecessary {item}".split(" ") -> commandParts = ["Unnecessary", "{item}"]
                    productsList.remove(item);
                }

                case "Correct" -> {
                    //command = "Correct {item} {newItem}".split(" ") -> commandParts = ["Correct", "{item}", "{newItem}"]
                    String newItem = commandParts[2]; //продукта, който ще ми бъде заместител
                    if (productsList.contains(item)) {
                        int position = productsList.indexOf(item);
                        productsList.set(position, newItem);
                    }
                }

                case "Rearrange" -> {
                    //command = "Rearrange {item}".split(" ") -> commandParts = ["Rearrange", "{item}"]
                    if (productsList.contains(item)) {
                        productsList.remove(item);
                        productsList.add(item);
                    }
                }
            }

            command = scanner.nextLine();
        }

        //отпечатваме продуктите в списъка разделени със запетая и интервал

        //начин 1: String.join -> работи само за списък от текстове
        //productsList = {"Tomato", "Cheese", "Milk"}
        System.out.println(String.join(", ", productsList));

        //начин 2: productsList = {"Tomato", "Cheese", "Milk"}
        //productsList.toString() -> "[Tomato, Cheese, Milk]"
       // System.out.println(productsList.toString() //"[Tomato, Cheese, Milk]"
                           // .replace("[", "") //"Tomato, Cheese, Milk]"
                            //.replace("]", ""));  //"Tomato, Cheese, Milk"

        //начин 3: for цикъл
        // productsList = {"Tomato", "Cheese", "Milk"}
        /*for (int position = 0; position <= productsList.size() - 1; position++) {
            String currentElement = productsList.get(position); //текущия продукт
            if (position == productsList.size() - 1) {
                System.out.print(currentElement);
            } else {
                System.out.print(currentElement + ", ");
            }
        }*/

    }
}
