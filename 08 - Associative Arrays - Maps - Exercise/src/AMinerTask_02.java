import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String resource = scanner.nextLine();
        Map<String, Integer> resources = new LinkedHashMap<>();
        while (!resource.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());

            //проверявам дали вече имам такъв ресърс в мапа
            if (resources.containsKey(resource)) {
                //взимам сегашното количество
                int currentQuantity = resources.get(resource);
                resources.put(resource, currentQuantity + quantity);
            } else {
                resources.put(resource, quantity);
            }

            resource = scanner.nextLine();
        }

        resources.entrySet().forEach(entry -> System.out.printf("%s -> %d\n", entry.getKey(), entry.getValue()));
    }
}
