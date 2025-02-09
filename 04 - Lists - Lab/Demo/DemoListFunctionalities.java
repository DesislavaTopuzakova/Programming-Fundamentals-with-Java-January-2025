package Lists_Lab;

import java.util.ArrayList;
import java.util.List;

public class DemoListFunctionalities {
    public static void main(String[] args) {

        //list -> структура от данни, в която съхраняваме еднотипни елементи
        //създаваме празен лист / списък
        //не трябва да задаваме максимален брой елементи
        List<String> names = new ArrayList<>(); //празен списък за текстове
        List<Integer> numbers = new ArrayList<>(); //празен списък за цели числа
        List<Double> prices = new ArrayList<>(); //празен списък за дробни числа

        //размер на лист = брой елементите в лист
        int size = names.size();
        System.out.println(names.size());

        //добавяме елемент в края на лист
        names.add("Ivan");   //size = 1
        names.add("Georgi"); //size = 2
        names.add("Peter");  //size = 3

        //вмъкваме елемент на конкретна позиция в лист
        //names = {"Ivan", "Georgi", "Peter"}
        names.add(1, "Stefan");

        System.out.println(names.size()); //4

        //премахваме елемент от лист
        //names = {"Ivan", "Stefan", "Georgi", "Peter"}
        names.remove("Georgi"); //size = 3
        //names = {"Ivan", "Stefan", "Peter"}

        //премахваме елемент от лист на конкретна позиция
        //names = {"Ivan", "Stefan", "Peter"}
        names.remove(1); //size = 2
        //names = {"Ivan", "Peter" }

        //достъпване на елемент в лист
        //names = {"Ivan", "Peter" }
        String name = names.get(1);
        System.out.println(names.get(0));

        //обхождане на лист
        List<Integer> numbersList = new ArrayList<>();
        numbersList.add(6);
        numbersList.add(34);
        numbersList.add(12);
        numbersList.add(58);
        //numbersList = {6, 34, 12, 58}
        //for - когато имаме зависимост от позицията на елементите в списъка
        for (int position = 0; position <= names.size() - 1; position++) {
            int number = numbersList.get(position);
            System.out.println(number);
        }

        //foreach - когато ни трябват само елементите в списъка, без позициите им
        for (int  number : numbersList) {
            //number - съхраняваме следващия елемент от списъка
            System.out.println(number);
        }

        //проверяваме дали в лист съществува даден елемент
        //contains
        //true -> ако елементът присъства в списъка
        //false -> ако елементът не присъства в списъка
        //numbersList = {6, 34, 12, 58}
        if (numbersList.contains(34)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        //заместване на елемент в списъка
        //numbersList = {6, 34, 12, 58} -> size = 4
        numbersList.set(0, 24);
        numbersList.set(2, 98);
        //numbersList = {24, 34, 98, 58} -> size = 4

        //проверка дали листът е празен
        //празен лист => size = 0
        //isEmpty
        //true -> листът е празен (size = 0)
        //false -> листът не е празен (size != 0)
        if (numbersList.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("List is NOT empty");
        }

        //clear
        numbersList.clear(); //премахва всички елементи в списъка, size = 0
        //numbersList = {}
    }
}
