package AdvertisementMessage_01;

import java.util.List;
import java.util.Random;

public class Message {

    private List<String> phrases = List.of("Excellent product.",
            "Such a great product.",
            "I always use that product.",
            "Best product of its category.",
            "Exceptional product.",
            "I can’t live without this product.");

    private List<String> events = List.of("Now I feel good.",
            "I have succeeded with this product.",
            "Makes miracles. I am happy of the results!",
            "I cannot believe but now I feel awesome.",
            "Try it yourself, I am very satisfied.",
            "I feel great!");

    private List<String> authors = List.of("Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva");

    private List<String> cities = List.of("Burgas", "Sofia", "Plovdiv", "Varna", "Ruse");

    private Random random = new Random();

    public String getRandomPhrase() {

        return phrases.get(random.nextInt(phrases.size()));
    }

    public String getRandomEvent() {

        return events.get(random.nextInt(events.size()));
    }
    public String getRandomAuthor() {

        return authors.get(random.nextInt(authors.size()));
    }
    public String getRandomCity() {

        return cities.get(random.nextInt(cities.size()));
    }
}
