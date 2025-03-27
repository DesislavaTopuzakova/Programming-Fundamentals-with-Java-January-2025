package FinalExamPrep1;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //ЧАСТ 1: съхраняваме информация за колите
        //запис: модел кола -> {км, гориво}
        Map<String, List<Integer>> carsMap = new LinkedHashMap<>();
        int countCars = Integer.parseInt(scanner.nextLine());
        for (int car = 1; car <= countCars; car++) {
            String [] data = scanner.nextLine().split("\\|");
            //"Audi A6|38000|62".split("|")
            //data = ["Audi A6", "38000", "62"]

            String carModel = data[0]; //модел на колата
            int mileage = Integer.parseInt(data[1]); //изминати км = пробег
            int fuel = Integer.parseInt(data[2]); //налично гориво

            //запазваме данните на колата
            carsMap.putIfAbsent(carModel, new ArrayList<>());
            carsMap.get(carModel).add(0, mileage);
            carsMap.get(carModel).add(1, fuel);
        }

        //ЧАСТ 2: изпълняваме команди върху колите
        String command = scanner.nextLine();
        while (!command.equals("Stop")) {
            String [] commandParts = command.split(" : ");
            String commandName = commandParts[0]; //"Drive", "Refuel", "Revert"
            String carModel = commandParts[1]; //модела на колата, с която ще работим

            switch (commandName) {
                case "Drive" -> {
                    //command = "Drive : Audi A6 : 50 : 34".split(" : ")
                    //commandParts = ["Drive", "Audi A6", "50", "34"]
                    //ШОФИРАНЕ
                    int distance = Integer.parseInt(commandParts[2]); //колко км искаме да караме
                    int consumedFuel = Integer.parseInt(commandParts[3]); //колко гориво ще изразходим

                    //1. имаме достатъчно гориво, за да преминем distance
                    int currentFuel = carsMap.get(carModel).get(1); //текущото гориво в колата
                    int currentKm = carsMap.get(carModel).get(0); //текущ пробег на колата
                    if (currentFuel >= consumedFuel) {
                        //заминаваме и пристигаме
                        carsMap.get(carModel).set(0, currentKm + distance);
                        carsMap.get(carModel).set(1, currentFuel - consumedFuel);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", carModel, distance, consumedFuel);
                    }
                    //2. нямаме достатъчно гориво, за да преминем distance
                    else {
                        System.out.println("Not enough fuel to make that ride");
                    }

                    //след карането -> проверка дали колата я премахваме
                    if (carsMap.get(carModel).get(0) >= 100000) {
                        //колата е стара -> премахваме
                        carsMap.remove(carModel);
                        System.out.printf("Time to sell the %s!%n", carModel);
                    }
                }

                case "Refuel" -> {
                    //command = "Refuel : Audi A6 : 60".split(" : ")
                    //commandParts = ["Refuel", "Audi A6", "60"]
                    //ЗАРЕЖДАНЕ
                    int fuelToRefill = Integer.parseInt(commandParts[2]); //колко литра зареждаме

                    int currentFuel = carsMap.get(carModel).get(1); //текущото гориво в колата
                    if (currentFuel + fuelToRefill <= 75) {
                        //събира се в резервоара
                        carsMap.get(carModel).set(1, currentFuel + fuelToRefill);
                        System.out.printf("%s refueled with %d liters%n", carModel, fuelToRefill);
                    } else {
                        //currentFuel + fuelToRefill > 75 -> прелива достигаме макс = 75
                        carsMap.get(carModel).set(1, 75);
                        System.out.printf("%s refueled with %d liters%n", carModel, 75 - currentFuel);
                    }
                }
                case "Revert" -> {
                    //command = "Revert : Audi A6 : 2500".split(" : ")
                    //commandParts = ["Revert", "Audi A6", "2500"]
                    //ВРЪЩА КИЛОМЕТРАЖА
                    int kmRevert = Integer.parseInt(commandParts[2]); //км, които трябва да върнем / извадим от текущите
                    int currentKm = carsMap.get(carModel).get(0);//текущи км на колата

                    int kmAfterRevert = currentKm - kmRevert;
                    if (kmAfterRevert < 10000) {
                        carsMap.get(carModel).set(0, 10000);
                    } else {
                        //kmAfterRevert >= 10000
                        carsMap.get(carModel).set(0, kmAfterRevert);
                        System.out.printf("%s mileage decreased by %d kilometers%n", carModel, kmRevert);
                    }
                }
            }
            command = scanner.nextLine();
        }

        //"{car} -> Mileage: {mileage} kms, Fuel in the tank: {fuel} lt."
        //entry
        //key: модел на колата
        //value: {км, гориво}
        carsMap.entrySet().forEach(entry -> {
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n",
                                                                                    entry.getKey(),
                                                                                    entry.getValue().get(0),
                                                                                    entry.getValue().get(1));
        });
    }
}
