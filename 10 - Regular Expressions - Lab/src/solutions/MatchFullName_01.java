package solutions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFullName_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        //създавам регекс
        String regex = "\\b([A-Z][a-z]+) ([A-Z][a-z]+)";

        //създавам шаблон като за целта използвам регекс
        Pattern pattern = Pattern.compile(regex);
        //матчар ми трябва за да откривам попадения по шаблона, който съм създа/задал
        Matcher matcher = pattern.matcher(text);

        //matcher.find() -> true/false ако намери следващо попадение
        while (matcher.find()) {

            System.out.print(matcher.group() + " ");
        }
    }
}
