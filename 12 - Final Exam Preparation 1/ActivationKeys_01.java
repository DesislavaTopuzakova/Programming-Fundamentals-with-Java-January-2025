package FinalExamPrep1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String activationKey = scanner.nextLine(); //ключ за активация
        String command = scanner.nextLine(); //команди, които трябва да изпълним върху activationKey

        while (!command.equals("Generate")) {
            String[] commandParts = command.split(">>>");
            String commandName = commandParts[0]; //"Contains", "Flip", "Slice"

            switch (commandName) {
                case "Contains" -> {
                    //command = "Contains>>>Ivan".split(">>>")
                    //commandParts = ["Contains", "Ivan"]
                    String textForChecking = commandParts[1];
                    //1. textForChecking се съдържа в activationKey
                    if (activationKey.contains(textForChecking)) {
                        System.out.println(activationKey + " contains " + textForChecking);
                    }
                    //2. textForChecking НЕ СЕ съдържа в activationKey
                    else {
                        System.out.println("Substring not found!");
                    }
                }

                case "Flip" -> {
                    //1. command = "Flip>>>Upper>>>1>>>3".split(">>>")
                    //-> commandParts = ["Flip", "Upper", "1", "3"]

                    //2. command = "Flip>>>Lower>>>2>>>4".split(">>>")
                    //-> commandParts = ["Flip", "Lower", "2", "4"]

                    String type = commandParts[1]; //"Upper" или "Lower"
                    int startPosition = Integer.parseInt(commandParts[2]);
                    int endPosition = Integer.parseInt(commandParts[3]);
                    //взимаме текста между дадените позиции -> текст, който ще заменяме
                    String textForReplace = activationKey.substring(startPosition, endPosition);
                    //променяме текста, който ще заменяме (textForReplace) спрямо вида на командата
                    String replacement = ""; //текст заместител
                    if (type.equals("Upper")) {
                        replacement = textForReplace.toUpperCase();
                    } else if (type.equals("Lower")) {
                        replacement = textForReplace.toLowerCase();
                    }
                    //правим замяна на textForReplace с replacement
                    activationKey = activationKey.replace(textForReplace, replacement);
                    System.out.println(activationKey);
                }

                case "Slice" -> {
                    //command = "Slice>>>1>>>4".split(">>>")
                    //commandParts = ["Slice", "1", "4"]
                    int startPosition = Integer.parseInt(commandParts[1]); //"1" -> parse -> 1
                    int endPosition = Integer.parseInt(commandParts[2]); //"4" -> parse -> 4

                    //изтриваме всички символи от activationKey от startPosition до endPosition (не е вкл.)
                    //начин 1: substring + replace
                    //String -> няма лесна опция за премахване на елементи от него!
                    String textForDelete = activationKey.substring(startPosition, endPosition);
                    activationKey = activationKey.replace(textForDelete, "");
                    System.out.println(activationKey);

                    //начин 2: StringBuilder
                    /*StringBuilder sb = new StringBuilder(activationKey);
                    sb.delete(startPosition, endPosition);
                    //sb.toString() -> държим новата версия на activationKey с изтритите букви
                    activationKey = sb.toString();
                    System.out.println(activationKey);*/

                }
            }
            command = scanner.nextLine();
        }

        System.out.println("Your activation key is: " + activationKey);
    }
}
