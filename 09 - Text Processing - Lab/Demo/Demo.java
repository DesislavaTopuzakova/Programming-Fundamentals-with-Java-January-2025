package TextProcessing_Lab;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //текст = съвкупност от символи = низ от символи = масив от символи
        //създаване на текстова променлива
        String name = "Desislava";
        String lastName = scanner.nextLine();

        //дължина на текст = броя на символите
        System.out.println(name.length()); //9

        //достъпва символ от текст
        char firstSymbol = name.charAt(0); //'D'
        System.out.println(firstSymbol); //първия символ в текста -> 'D'
        System.out.println(name.charAt(name.length() - 1)); //последния символ в текста -> 'a'

        //string е immutable (read-only)
        name = name.replace('e', 'r');

        //преобразуване на текст към масив от символи
        char[] symbolsArray = name.toCharArray(); //['D', 'e', 's', 'i', 's', 'l', 'a', 'v', 'a']

        //обхождане на текст = преминаваме през всеки един символ на текста
        //начин 1: for цикъл, с който обхождаме всички позиции и символите на тях
        //name = "Desislava"
        for (int position = 0; position <= name.length() - 1; position++) {
            char symbol = name.charAt(position);
            System.out.println(symbol);
        }

        //начин 2: foreach цикъл, с който обхождаме всички символи
        //name = "Desislava".toCharArray() -> ['D', 'e', 's', 'i', 's', 'l', 'a', 'v', 'a']
        for (char symbol : name.toCharArray()) {
            System.out.println(symbol);
        }


        //split на текст
        String sentence = "I am Desislava from Stara Zagora";
        String[] words = sentence.split(" "); //["I", "am", "Desislava", "from", "Stara", "Zagora"]

        //join на съвкупност от текстове
        String fullName = String.join(",", "Desislava", "Topuzakova", "Stara Zagora");
        String fullSentence = String.join(" - ", words); //"I - am - Desislava - from - Stara - Zagora"

        //конкатенация = долепяне на текстове
        //string + string = string
        //string + int = string
        //string + double = string
        //string + char = string
        String firstName = "Ivan";
        String middleName = "Petrov";

        String result = firstName + " " + middleName + 23;
        String result2 = firstName.concat(middleName).concat(" ").concat("23");

        //contains -> проверка дали даден текст се съдържа в друг текст
        //true -> ако дадения текст се съдържа в основния текст
        //false -> ако дадения текст НЕ се съдържа в основния текст
        boolean isContaining = firstName.contains("Pet"); //false
        if (firstName.contains("Iv")) {
            System.out.println(firstName);
        }

        //startsWith / endsWith -> проверка дали даден текст започва / завършва с друг текст
        boolean isStarting = firstName.startsWith("Iv"); //true
        boolean isEnding = middleName.endsWith("ev"); //false


        //replace -> заменя всички срещания на даден текст с друг такъв
        String address = "street Hristo Botev, number 5, Sofia, Bulgaria";
        address = address.replace("Hristo Botev", "Vasil Levski");
        address = address.replace("e", "eee");

        //indexOf -> от коя позиция започваме да срещаме даден текст за първи път
        String fruits = "banana, apple, kiwi, banana, apple";
        System.out.println(fruits.indexOf("banana"));    // 0
        System.out.println(fruits.indexOf("orange"));     //-1 -> в текста fruits не се съдържа текста "orange"

        //lastIndexOf -> от коя позиция започваме да срещаме даден текст за последен път
        System.out.println(fruits.lastIndexOf("banana")); // 21
        System.out.println(fruits.lastIndexOf("orange")); // -1 -> в текста fruits не се съдържа текста "orange"

        //substring -> взимаме подтекст от друг текст
        String myName = "Desislava";
        //1. substring(int startPosition)
        String substringName = myName.substring(4); //взима текста от 4-тата позиция до края -> "slava"
        //2. substring(int startPosition, int endPosition)
        String partOfName = myName.substring(1, 4); //взима текста от първата позиция до третата включително -> "esi"


    }
}
