package Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                                .map(Integer::parseInt).collect(Collectors.toList());

        int sumRemovedElements = 0; //сума на всички премхнати елементи от списъка

        //повтаряме: въвеждаме позиции от листа
        //стоп: празен лист = нямаме елементи в него -> бр. елементи <= 0
        //продължаваме: не е празен листа = имаме елементи в списъка -> бр. елементи > 0

        while (numbers.size() > 0) { //while (!numbers.isEmpty()) {
            int position = Integer.parseInt(scanner.nextLine());
            if (position < 0) {
                //1. position < 0 -> премахваме първия елемент и поставяме последния на негово място
                //{5, 10, 6, 3}
                int firstElement = numbers.get(0); //премахнатия елемент
                numbers.remove(0);
                sumRemovedElements += firstElement;
                int lastElement = numbers.get(numbers.size() - 1);
                numbers.add(0, lastElement);

                //модифицираме елементите на списъка спрямо премахнатия елемент -> firstElement
                modifyList(numbers, firstElement);
            } else if (position > numbers.size() - 1) {
                //2. position > numbers.size() - 1 -> премахваме последния елемент и поставяме първия на негово място
                //{5, 10, 6, 3}
                int lastElement = numbers.get(numbers.size() - 1); //премахнатия елемент
                numbers.remove(numbers.size() - 1);
                sumRemovedElements += lastElement;
                int firstElement = numbers.get(0);
                numbers.add(firstElement);

                //модифицираме елементите на списъка спрямо премахнатия елемент -> lastElement
                modifyList(numbers, lastElement);
            } else {
                //3. position >= 0 && position <= numbers.size() - 1 -> валидна позиция -> премахваме елемента на тази позиция
                int elementForRemove = numbers.get(position);
                numbers.remove(position);
                sumRemovedElements += elementForRemove;

                //модифицираме елементите на списъка спрямо премахнатия елемент -> elementForRemove
                modifyList(numbers, elementForRemove);
            }
        }

        System.out.println(sumRemovedElements);
    }

    //метод, който модифицира списъка спрямо премахнатия елемент
    private static void modifyList (List<Integer> numbers, int removedElement) {
        //numbers = {14, 2, 24, 15, 18}
        //removedElement = 10
        for (int position = 0; position <= numbers.size() - 1; position++) {
            int currentElement = numbers.get(position);
            if (currentElement <= removedElement) {
                currentElement += removedElement;
            } else { //currentElement > removedElement
                currentElement -= removedElement;
            }
            numbers.set(position, currentElement);
        }
    }
}
