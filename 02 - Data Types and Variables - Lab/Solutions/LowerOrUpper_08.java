package DataTypesAndVariables_Lab;

import java.util.Scanner;

public class LowerOrUpper_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char symbol = scanner.nextLine().charAt(0);
        //"upper-case" -> ако въведения символ е главна буква
        //"lower-case" -> ако въведения символ е малка буква

        //начин 1: с вградени фукционалности за символи
        //isUpperCase
        //true -> ако символът е главна буква
        //false -> ако символът е малка буква

        //isLowerCase
        //true -> ако символът е малка буква
        //false -> ако символът е главна буква
        if (Character.isLowerCase(symbol)) {
            System.out.println("lower-case");
        } else {
            System.out.println("upper-case");
        }

        //начин 2: проверка за аски кода
        //малка буква: код трябва да е между 97 и 122 (вкл.)
        //главна буква: код трябва е между 65 и 90 (вкл.)
        int code = (int) symbol; //ascii кода на въведения символ
        if (code >= 97 && code <= 122) {
            System.out.println("lower-case");
        } else if (code >= 65 && code <= 90) {
            System.out.println("upper-case");
        }

    }
}
