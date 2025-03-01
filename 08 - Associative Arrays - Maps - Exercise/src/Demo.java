import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Сценарий: Даваме възможност на потребител да търси телефонен номер в указателя по име.
        // Ако в указателя няма регистриран човек с посоченото име, връщаме съобщение,
        // което информира, че такъв потребител не съществува.
        Map<String, String> phoneBook = new LinkedHashMap<>();
        phoneBook.put("Desi", "088787765456");
        phoneBook.put("Pesho", "088787765456");
        phoneBook.put("Viki", "088787765456");
        phoneBook.put("Sasho", "088787765456");
        phoneBook.put("Mimi", "088787765456");

        // прочитам име от конзолата
        String name = scanner.nextLine();

        //връщам телефонен номер или default съобщение - No registered phone number for - " + name
        System.out.println(phoneBook.getOrDefault(name, "No registered phone number for - " + name));
    }
}
