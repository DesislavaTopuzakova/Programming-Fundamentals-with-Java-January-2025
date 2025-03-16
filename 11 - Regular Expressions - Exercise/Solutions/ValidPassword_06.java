package Regex_Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPassword_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPasswords = Integer.parseInt(scanner.nextLine()); //брой пароли
        Pattern pattern = Pattern.compile("\\_\\.+(?<passwordText>[A-Z][A-Za-z0-9]{4,}[A-Z])\\_\\.+");

        for (int count = 1; count <= countPasswords; count++) {
            String password = scanner.nextLine();
            //1. проверка дали въведената парола е валидна
            Matcher matcher = pattern.matcher(password);
            //matcher -> съвкупност от текстове, които отговарят на шаблона
            //вариант 1: matcher = ["_...ChelseA_."] -> валидна парола
            //вариант 2: matcher = [] -> невалидна парола

            if (matcher.find()) {
                //matcher.find() == true -> валидна парола
                //matcher.find() => "_...ChelseA_."
                //имаме валидна парола -> категоризирам
                String passwordText = matcher.group("passwordText"); //"ChelseA"
                //2. категоризаация на паролата -> трябва да намерим всички цифри в паролата и да ги долепим
                StringBuilder sbDigits = new StringBuilder(); //празен, в който да долепям намерените цифри
                //"ChelseA".toCharArray() -> ['C', 'h', 'e', 'l', 's', 'e', 'A']
                for (char symbol : passwordText.toCharArray()) {
                    if (Character.isDigit(symbol)) {
                        //текущия символ е цифра
                        sbDigits.append(symbol);
                    }
                }

                //sb -> долепени всички цифри от паролата
                //1. нямаме цифри в паролата
                if (sbDigits.isEmpty()) { //sb.length() == 0
                    System.out.println("Group: default");
                }
                //2. имаме цифри в паролата
                else { //sb.length() != 0
                    System.out.println("Group: " + sbDigits);
                }
            } else {
                //matcher.find() == false -> matcher = [] -> невалидна парола
                System.out.println("Invalid pass!");
            }

        }
    }
}
