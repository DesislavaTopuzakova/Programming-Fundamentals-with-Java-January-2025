package MidExamPrep2;

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //повтаряме: въвеждаме входни данни ("special" / "regular" или суми под формата на текст)
        //стоп: входни данни == "special" или входни дании == "regular"
        //продължаваме: входни данни != "special" и входни дании != "regular"

        double totalPrice = 0; //крайната сума, която трябва да се плати
        double totalTaxes = 0; //обща сума на данъците
        double totalPriceWithoutTaxes = 0; //сумата на цените без данък и отстъпки

        String input = scanner.nextLine();
        while (!input.equals("special") && !input.equals("regular")) {
            //input = "1000.50"
            double currentPrice = Double.parseDouble(input); //цена на 1 част от компютъра без ДДС

            //проверка дали цената е отрицателна
            if (currentPrice < 0) {
                System.out.println("Invalid price!");
                input = scanner.nextLine();
                continue;
            }

            totalPriceWithoutTaxes += currentPrice;

            //добавим ДДС
            double tax = currentPrice * 0.20; //колко е ДДС за въведената сума
            totalTaxes += tax; //добавяме текущото ДДС към общата сума на данъците
            currentPrice += tax; //добавям ДДС-то към въведената сума


            //добавяме цената на всяка част към общата сума
            totalPrice += currentPrice;

            //въвеждаме нови входни данни
            input = scanner.nextLine();
        }

        //прекратяваме цикъла -> спираме пазаруването -> отпечатаме касовата бележка
        //input == "special" -> специален клиент, който е пазарувал
        //input == "regular" -> регулярен клиен, който е пазарувал
        //Отстъпка на специален клиент
        if (input.equals("special")) {
            //-10% на общата сума от частите за компютъра
            //totalPrice = totalPrice - 0.10 * totalPrice;
            //totalPrice = 0.9 * totalPrice;
            totalPrice *= 0.9;
        }

        if (totalPrice <= 0) {
            System.out.println("Invalid order!");
        } else {
            //totalPrice > 0 ->  отпечатваме бележката
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", totalPriceWithoutTaxes); //сумата без ДДС преди намалението
            System.out.printf("Taxes: %.2f$%n", totalTaxes); //общата сума на данъците
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$", totalPrice);

        }


    }
}
