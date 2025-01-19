package DataTypesAndVariables_Lab;

import java.util.Scanner;

public class TownInfo_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //входни данни
        String townName = scanner.nextLine();
        int population = Integer.parseInt(scanner.nextLine());
        short area = Short.parseShort(scanner.nextLine());

        //отпечатаме форматиран текст
        String formattedText = String.format("Town %s has population of %d and area %d square km.",  townName, population, area);
        System.out.printf(formattedText);
    }
}
