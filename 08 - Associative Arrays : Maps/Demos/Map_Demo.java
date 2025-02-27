package Maps_Lab;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map_Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Associative Arrays / Maps / Речници
        //колекция / съвкупност от еднотипни записи
        //всеки запис си има ключ (key) и стойност (value)
        //всички функционалности работят за всички видове map-ове (HashMap, LinkedHashMap, TreeMap)

        //създаване на празен map, в който ще съхраняваме информация за ученик и оценката му
        Map<String, Double> studentGrades = new HashMap<>();

        //добавяме записи в map
        studentGrades.put("Ivan", 3.50); //добавяме записа без значение дали има запис с такъв ключ
        studentGrades.putIfAbsent("Georgi", 4.50); //добавя записа, ако няма друг запис със същия ключ


        //премахваме записи от map
        studentGrades.remove("Ivan"); //премахваме целия запис по зададен ключ
        studentGrades.remove("Georgi", 4.50); //премахваме целия запис по зададен ключ и стойност

        //достъпване на записи
        System.out.println(studentGrades.get("Ivan"));
        double grade = studentGrades.get("Georgi");
        System.out.println(grade);

        //проверка дали в даден map съществува ключ или стойност
        boolean isKeyContains = studentGrades.containsKey("Desi"); //false
        System.out.println(studentGrades.containsKey("Ivan")); //true
        //containsKey
        //true -> ако в map-а има запис с дадения ключ
        //false -> ако в map-а няма запис с дадения ключ

        System.out.println(studentGrades.containsValue(4.50)); //true
        System.out.println(studentGrades.containsValue(2.60)); //false
        //containsValue
        //true -> ако в map-а има запис с даденото value
        //false -> ако в map-а няма запис с даденото value

        //размер на map -> колко е броят на записите в него
        System.out.println(studentGrades.size());
        int size = studentGrades.size();

        //обхождане на map
        //entrySet -> съвкупност от записи
        for (Map.Entry<String, Double> entry : studentGrades.entrySet()) {
            //всеки един запис се съхранява в променливата entry
            //entry: key и value
            //entry.getKey() -> име на студента (String)
            //entry.getValue() -> оценката на студента (Double)
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
