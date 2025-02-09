package Lists_Lab;

import java.util.*;
import java.util.stream.Collectors;

public class DemoReadingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. лист с константни стойности
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60));
        //numbers = {10, 20, 30 , 40 , 50 , 60}

        List<String> names = new ArrayList<>(Arrays.asList("Ivan", "Georgi", "Peter"));
        //names = {"Ivan", "Georgi", "Peter"}

        //2. въвеждаме списък с цели числа
        //scanner.nextLine() -> "3 4 5 6 7"
        //scanner.nextLine().split(" ") -> ["3", "4", "5", "6", "7"]
        //Arrays.stream(scanner.nextLine().split(" ")) -> позволява да обработваме всички елементи на масива
        //.map(Integer::parseInt) -> [3, 4, 5, 6, 7]
        //.collect(Collectors.toList()); -> {3, 4, 5, 6, 7}
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                                    .map(Integer::parseInt)
                                    .collect(Collectors.toList());

        //2. въвеждаме списък с дробни числа
        List<Double> pricesList = Arrays.stream(scanner.nextLine().split(" "))
                                    .map(Double::parseDouble)
                                    .collect(Collectors.toList());

        //3. въвеждаме списък с текстове
        List<String> namesList = Arrays.stream(scanner.nextLine().split(" "))
                                .collect(Collectors.toList());;


        //при създаване:  .collect(Collectors.toList()); -> създаваме списък, който в последствие ще манипулирам
        //при създаване:  .toList(); -> създаваме списък, който не можем да манипулираме


        //1. използваме масив, когато: съхраняваме съвкупност от еднотипни елементи, които няма да подлежат на манипулации
        //2. използваме лист, когато: съхраняваме съвкупност от еднотипни елементи, които ще подлежат на манипулация


    }
}
