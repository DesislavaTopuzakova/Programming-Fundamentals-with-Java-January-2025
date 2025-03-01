import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniExamResults_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> usersAndPoints = new LinkedHashMap<>();
        Map<String, Integer> languageCount = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("exam finished")) {

            //проверявам дали имам операция бан data[1].equals("banned")
            if (input.contains("banned")) {
                String name = input.split("-")[0];
                usersAndPoints.remove(name);
                input = scanner.nextLine();
                continue;
            }
            //превръщам инпута в масив -> ["Peter","Java","84"]
            String[] data = input.split("-");
            String name = data[0]; //"Peter"
            String language = data[1]; //"Java"
            int points = Integer.parseInt(data[2]); //"84"

            //ако нямам такова име ще го добавя заедно с неговите точки
            if (!usersAndPoints.containsKey(name)) {
                usersAndPoints.put(name, points);
            } else {
                //взимам точките които има за да проверя дали си по-големи от сегашния събмит.
                int currentPoints = usersAndPoints.get(name);
                if  (points > currentPoints) {
                    usersAndPoints.put(name, points);
                }
            }

            //проверявам дали вече имам такъв език в мапа
            if (!languageCount.containsKey(language)) {
                languageCount.put(language, 1);
            } else {
                int currentCount = languageCount.get(language);
                languageCount.put(language, currentCount + 1);
            }
            input = scanner.nextLine();
        }

        System.out.println("Results:");
        usersAndPoints.entrySet().forEach(entry -> System.out.printf("%s | %d\n", entry.getKey(), entry.getValue()));

        System.out.println("Submissions:");
        languageCount.entrySet().forEach(entry -> System.out.printf("%s - %d\n", entry.getKey(), entry.getValue()));

    }
}
