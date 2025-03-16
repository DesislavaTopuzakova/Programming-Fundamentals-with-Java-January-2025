package Regex_Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern pattern = Pattern.compile(">>(?<furnitureName>[A-Za-z]+)<<(?<price>[0-9]+[.]?[0-9]*)!(?<quantity>[0-9]+)"); //шаблон
        String input = scanner.nextLine(); //входни данни
        double totalPrice = 0; //обща сума за всички закупени мебели

        System.out.println("Bought furniture:");
        while (!input.equals("Purchase")) {
            //input = ">>Sofa<<312.23!3"
            //проверка дали входните данни са валидни -> отговарят на шаблона
            Matcher matcher = pattern.matcher(input);
            //matcher -> съвкупност от текстове, които отговарят на шаблона
            //matcher = [">>Sofa<<312.23!3"]
            //find
            //true -> input отговаря на шаблона
            //false -> input не отговаря на шаблона

            if (matcher.find()) {
                //input отговарят на шаблона -> валидни входни данни -> информация за закупена мебел
                //matcher.find() = ">>(?<furnitureName>Sofa)<<(?<price>312.23)!(?<quantity>3)"
                String furnitureName = matcher.group("furnitureName"); //"Sofa"
                double price = Double.parseDouble(matcher.group("price")); //"312.23" -> 312.23
                int quantity = Integer.parseInt(matcher.group("quantity")); //"3" -> 3

                System.out.println(furnitureName);
                double pricePerFurniture = price * quantity;
                totalPrice += pricePerFurniture;
            }
            input = scanner.nextLine();
        }

        System.out.printf("Total money spend: %.2f", totalPrice);
    }
}
