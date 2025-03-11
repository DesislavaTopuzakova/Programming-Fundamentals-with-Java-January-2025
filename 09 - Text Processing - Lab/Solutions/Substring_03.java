package TextProcessing_Lab;

import java.util.Scanner;

public class Substring_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();      //"ice"
        String sentence = scanner.nextLine(); //"kicegiciceeb"

        //повтаряме: премахваме думата от изречението
        //стоп: в изречението не се съдържа думата
        //продължаваме: в изречението се съдържа думата

        while (sentence.contains(word)) {
            //премахнвам думата от изречението
            sentence = sentence.replace(word, "");
        }

        //в изречението не се съдържа думата
        System.out.println(sentence);

    }
}
