package RandomizeWords_01;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] words = input.split(" ");

        Random random = new Random();
        for (int i = 1; i <= words.length; i++) {

            int firstIndex = random.nextInt(words.length);
            int secondIndex = random.nextInt(words.length);

            //взимам думи по тегния индекс и ги разменям
            String firstWord = words[firstIndex];
            String secondWord = words[secondIndex];

            words[firstIndex] = secondWord;
            words[secondIndex] = firstWord;
        }

        for (String word : words) {
            System.out.println(word);
        }
    }
}
