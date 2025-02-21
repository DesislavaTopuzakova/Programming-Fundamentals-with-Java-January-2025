package AdvertisementMessage_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Message message = new Message();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String phrase = message.getRandomPhrase();
            String event = message.getRandomEvent();
            String author = message.getRandomAuthor();
            String city = message.getRandomCity();
            System.out.printf("%s %s %s – %s%n",phrase, event, author, city);
        }
    }
}
