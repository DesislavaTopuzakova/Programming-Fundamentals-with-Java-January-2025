import java.util.*;

public class PlantDiscovery_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> plantsRarity = new LinkedHashMap<>();
        Map<String, List<Double>> plantsRatings = new LinkedHashMap<>();
        for (int i = 1; i <= n; i++) {
            //"{plant}<->{rarity}" -> .split("<->") ["plant", "rarity"]
            String input = scanner.nextLine();

            String plant = input.split("<->")[0];
            int rarity = Integer.parseInt(input.split("<->")[1]);

            //запазвам растението и неговия индекс на рядкост
            plantsRarity.put(plant, rarity);

            //запазвам растението и списък с рейтинг само ако вече не съм го запазил
            plantsRatings.putIfAbsent(plant, new ArrayList<>());
        }

        String command = scanner.nextLine();
        while (!command.equals("Exhibition")) {

            String[] commandParts = command.split(": ");
            String commandName = command.split(": ")[0]; // -> "Rate", "Update" , "Reset"
            String plant = commandParts[1].split(" - ")[0];

            //преди да изпълним командата трябва да проверим дали имаме такова растение в мапа
            if (!plantsRarity.containsKey(plant)) {
                //нямам тапазено такова растение и няма как да оперирам по него
                System.out.println("error");
                command = scanner.nextLine();
                continue;
            }

            if (commandName.equals("Rate")) {
                //"Rate: {plant} - {rating}" – add the given rating to the plant (store all ratings)
                double rating = Double.parseDouble(commandParts[1].split(" - ")[1]);
                plantsRatings.get(plant).add(rating);

            } else if (commandName.equals("Update")) {
                //"Update: {plant} - {new_rarity}" – update the rarity of the plant with the new one
                int newRarity = Integer.parseInt(commandParts[1].split(" - ")[1]);

                plantsRarity.put(plant, newRarity);
            } else if (commandName.equals("Reset")) {
                //"Reset: {plant}" – remove all the ratings of the given plant
                plantsRatings.get(plant).clear();
            }


            command = scanner.nextLine();
        }

        System.out.println("Plants for the exhibition:");

        plantsRarity.entrySet().forEach(entry -> {

            String plantName = entry.getKey();
            int rarity = entry.getValue();
            //мапвам към дабъл и намирам авг, ако няма такава стойност връщам нула
            double avgRating = plantsRatings.get(plantName).stream().mapToDouble(rating -> rating).average().orElse(0.0);

            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", plantName, rarity, avgRating);
        });
    }
}
