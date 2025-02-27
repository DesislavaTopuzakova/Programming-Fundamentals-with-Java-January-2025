package Maps_Lab;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTypes_Demo {
    public static void main(String[] args) {
        //HashMap - нямаме гарантирана подредба на записите
        //LinkedHashMap - записите се пореждат спрямо ред на добавяне
        //TreeMap - записите се подреждат по ключ в нарастващ ред

        //число -> име на човек
        Map<Integer, String> people = new LinkedHashMap<>();
        people.put(1, "Aleks");
        people.put(2, "Boyan");
        people.put(3, "Georgi");

        //име на ученик -> оценка
        Map<String, Double> students = new TreeMap<>();
        students.put("Peter", 5.60);
        students.put("Aleks", 4.50);
        students.put("Georgi", 3.40);

    }
}
