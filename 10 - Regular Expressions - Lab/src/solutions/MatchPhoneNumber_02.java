package solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        //създавам регекс
        String regex = "\\+\\d{3}([\\s-])2\\1\\d{3}\\1\\d{4}\\b";

        //създавам шаблон
        Pattern pattern = Pattern.compile(regex);
        //матчар ми трябва за да откривам попадения по шаблона, който съм създа/задал
        Matcher matcher = pattern.matcher(text);

        List<String> validNumbers = new ArrayList<>();
        //matcher.find() -> true/false ако намери следващо попадение
        while (matcher.find()) {
            validNumbers.add(matcher.group());
        }

        //String.join() взимам всички елементи и ги принтирам със запетая и спейс на конзолата
        System.out.println(String.join(", ", validNumbers));
    }
}
