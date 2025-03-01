import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, String> liftOfUsers = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            String command = input.split("\\s+")[0];
            String user = input.split("\\s+")[1];

            if (command.equals("register")) {
                if (liftOfUsers.containsKey(user)) {
                    System.out.printf("ERROR: already registered with plate number %s%n", liftOfUsers.get(user));
                } else {
                    String plate = input.split("\\s+")[2];
                    liftOfUsers.put(user, plate);
                    System.out.printf("%s registered %s successfully%n", user, plate);
                }
            } else if (command.equals("unregister")) {
                if (liftOfUsers.containsKey(user)) {
                    liftOfUsers.remove(user);
                    System.out.printf("%s unregistered successfully%n", user);
                } else {
                    System.out.printf("ERROR: user %s not found%n", user);
                }
            }
        }

        //liftOfUsers.forEach( (k, v) -> System.out.println(k + " => " + v));

        for (Map.Entry<String, String> entry : liftOfUsers.entrySet()) {

            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
