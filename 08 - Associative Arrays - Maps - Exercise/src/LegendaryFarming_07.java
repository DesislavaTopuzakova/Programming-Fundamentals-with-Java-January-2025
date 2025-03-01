import java.util.LinkedHashMap;
import java.util.Scanner;

public class LegendaryFarming_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> materials = new LinkedHashMap<>();
        materials.put("shards", 0);
        materials.put("fragments", 0);
        materials.put("motes", 0);
        String obtainedItem = "";
        boolean isObtained = false;
        while (!isObtained) {
            //"3 Motes 5 stones 5 Shards"
            //прочитайко входа, правя всичко на малки букви
            String input = scanner.nextLine().toLowerCase();
            String[] data = input.split("\\s+");

            for (int i = 0; i < data.length; i += 2) {
                //взимам количеството и името на материала
                int quantity = Integer.parseInt(data[i]);
                String material = data[i + 1];

                //проверявам дали нямам такъв материал
                if (!materials.containsKey(material)) {
                    materials.put(material, quantity);
                } else {
                    int currentQuantity = materials.get(material);
                    materials.put(material, currentQuantity + quantity);
                }

                //взимам вече субраните материали и проверявам дали са станали 250 или повече
                int totalQuantity = materials.get(material);
                if (totalQuantity >= 250) {
                    if (material.equals("shards")) {
                        obtainedItem = "Shadowmourne";
                        isObtained = true;
                    } else if (material.equals("fragments")) {
                        obtainedItem = "Valanyr";
                        isObtained = true;
                    } else if (material.equals("motes")) {
                        obtainedItem = "Dragonwrath";
                        isObtained = true;
                    }
                }
                //трябва да похарча 250 материала за да купя -> Shadowmourne, Valanyr или  Dragonwrath
                if (isObtained) {
                    materials.put(material, totalQuantity - 250);
                    break;
                }

            }
        }

        System.out.println(obtainedItem + " obtained!");
        materials.entrySet().forEach(entry -> System.out.printf("%s: %d\n", entry.getKey(), entry.getValue()));

        /* for (Map.Entry<String, Integer> entry : materials.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        }
        */
        /*  materials.forEach( (k, v) -> System.out.printf("%s: %d%n", k, v));*/
    }
}
