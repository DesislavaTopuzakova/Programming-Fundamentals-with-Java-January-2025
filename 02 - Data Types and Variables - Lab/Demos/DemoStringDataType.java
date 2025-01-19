package DataTypesAndVariables_Lab;

import java.util.Scanner;

public class DemoStringDataType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //текстов тип данни: String
        String name = "Desi";

        //конкатенация: долепяме текстове
        System.out.println(name + " is a Java Developer."); //"Desi is a Java Developer";
        //String + String = String

        System.out.println(name + 45); //"Desi45"
        //String + int = String

        System.out.println(name + 56.7); //"Desi56.7"
        //String + double = String

    }
}
