import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class EmojiDetector_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //(:{2}|\*{2})[A-Z][a-z]{2,}\1

        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("(:{2}|\\*{2})[A-Z][a-z]{2,}\\1");
        Matcher matcher = pattern.matcher(input);

        List<String> emojis = new ArrayList<>();
        while (matcher.find()) {
            //взимам си намереното емоджи и фо домавям в лист
            emojis.add(matcher.group());
        }

        //изчислявам coolThreshold като умножавам всички намерени числа в input
        long coolThreshold = 1;
        for (char symbol : input.toCharArray()) {

            if (Character.isDigit(symbol)) {
                coolThreshold *= Character.getNumericValue(symbol);
            }
        }

        //калкулирам емоджитата
        List<String> coolEmojis = new ArrayList<>();
        for (String emoji : emojis) {

            int coolness = 0;
            for (int position = 2; position < emoji.length() - 2; position++) {

                coolness += emoji.charAt(position);
            }

            //добавям емоджито ако има достатъчно висок праг на "coolness"
            if (coolness >= coolThreshold) {
                coolEmojis.add(emoji);
            }
        }

        System.out.println("Cool threshold: " + coolThreshold);
        System.out.println(emojis.size() + " emojis found in the text. The cool ones are:");

        for (String coolEmoji : coolEmojis) {
            System.out.println(coolEmoji);
        }
    }
}
