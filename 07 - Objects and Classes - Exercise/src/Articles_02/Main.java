package Articles_02;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> articleContent = Arrays
                .stream(scanner.nextLine().split(", "))
                .toList();

        int n = Integer.parseInt(scanner.nextLine());

        String title = articleContent.get(0);
        String content = articleContent.get(1);
        String author = articleContent.get(2);

        Article article = new Article(title, content, author);

        for (int i = 1; i <= n; i++) {

            String input = scanner.nextLine();
            String command = input.split(": ")[0];
            String text = input.split(": ")[1];

            if (command.equals("Edit")) {
                article.edit(text);
            } else if (command.equals("ChangeAuthor")) {
                article.changeAuthor(text);
            } else if (command.equals("Rename")) {
                article.rename(text);
            }
        }

        System.out.println(article.toString());
    }
}
