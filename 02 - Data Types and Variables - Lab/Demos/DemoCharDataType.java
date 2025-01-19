package DataTypesAndVariables_Lab;

import java.util.Scanner;

public class DemoCharDataType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //символен тип данни: единични символи
        char letter = 'o';

        //прочитане на символ от конзолата
        char symbol = scanner.nextLine().charAt(0);

        //достъпва символ от текст
        String name = "Desi";
        char currentSymbol = name.charAt(2); //'s'
        System.out.println(name.charAt(1));

        //ASCII Table - таблица с всички валидни символи, които се намират на клавиатурата
        //ASCII Code - цяло число, с което се характеризира всеки един символ
        char mySymbol = 'U';
        System.out.println((int) mySymbol); //85

        int number = 65;
        System.out.println((char) number); //'A'

        //главна буква: код е между 65 до 90 (вкл)
        //малка буква: код е между 97 до 122 (вкл)
    }
}
