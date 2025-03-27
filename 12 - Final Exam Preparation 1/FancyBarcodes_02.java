package FinalExamPrep1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("[@][#]+[A-Z][A-Za-z0-9]{4,}[A-Z][@][#]+");

        //входни данни
        int countBarcodes = Integer.parseInt(scanner.nextLine());
        for (int count = 1; count <= countBarcodes; count++) {
            String textBarcode = scanner.nextLine(); //"@#FreshFisH@#"
            Matcher matcher = pattern.matcher(textBarcode);
            //matcher съхранявам всички текстове, които отговарят на шаблона
            //matcher = ["@#FreshFisH@#"]

            //проверка дали е валиден
            if (matcher.find()) {
                //въведения баркод е валиден
                String productGroup = getProductGroup(textBarcode);
                System.out.println("Product group: " + productGroup);
            } else {
                //въведения баркод не е валиден
                System.out.println("Invalid barcode");
            }
        }

    }

    //метод, който приема текста на баркода и от него извлича цифрите и ги долепя в текст
    private static String getProductGroup(String textBarcode) {
        //textBarcode = "@###Che46sE@##"
        //"@###Che46sE@##".toCharArray() -> ['@', '#', ....]
        StringBuilder sbDigits = new StringBuilder(); //долепяме само цифрите
        for (char symbol : textBarcode.toCharArray()) {
            if (Character.isDigit(symbol)) {
                sbDigits.append(symbol);
            }
        }

        //sbDigits -> текст с цифри
        //sbDigits е празен -> в баркода няма цифри -> productGroup = "00"
        //sbDigits не е празен -> в баркода има цифри -> productGroup = "46"

        if (sbDigits.isEmpty()) {
            return "00";
        } else {
            return sbDigits.toString();
        }
    }
}
