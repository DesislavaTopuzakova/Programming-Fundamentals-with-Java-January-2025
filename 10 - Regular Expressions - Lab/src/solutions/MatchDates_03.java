package solutions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDates_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "\\b(?<day>\\d{2})([\\.\\-\\/])(?<month>[A-Z][a-z]{2})\\2(?<year>\\d{4})\\b";

        //създавам шаблон като за целта използвам регекс
        Pattern pattern = Pattern.compile(regex);
        //матчар ми трябва за да откривам попадения по шаблона, който съм създа/задал
        Matcher matcher = pattern.matcher(input);

        //matcher.find() -> true/false ако намери следващо попадение
        while (matcher.find()) {

            String day = matcher.group("day"); //String day = matcher.group(1);
            String month = matcher.group("month"); //String day = matcher.group(3);
            String year = matcher.group("year"); //String day = matcher.group(4);

            System.out.printf("Day: %s, Month: %s, Year: %s\n", day, month, year);
        }
    }
}
