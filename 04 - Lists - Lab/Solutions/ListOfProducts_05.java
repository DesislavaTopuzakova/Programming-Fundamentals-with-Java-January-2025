package Lists_Lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListOfProducts_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> productsList = new ArrayList<>(); //празен списък, в който ще съхраняваме продуктите

        int productsCount = Integer.parseInt(scanner.nextLine());

        for (int count = 1; count <= productsCount; count++) {
            String productName = scanner.nextLine();
            productsList.add(productName);
        }

        //productsList = {"Potatoes", "Tomatoes", "Onions", "Apples"}
        //sort list of string -> A-Z -> ascending order / нарастващ ред
        //sort list of numbers -> 1-10 -> ascending order / нарастващ ред
        Collections.sort(productsList);
        //productsList = {"Apples", "Onions", "Potatoes", "Tomatoes"}

        int number = 1; //номерацията на продукта
        for (String product : productsList) {
            System.out.println(number + "." + product);
            number++;
        }
    }
}
