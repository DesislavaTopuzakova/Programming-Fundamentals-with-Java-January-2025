package Maps_Lab;

import java.util.*;

public class WordSynonyms_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wordsCount = Integer.parseInt(scanner.nextLine()); //брой на думи за обработка

        //дума (String) -> списък със синоними (List<String>)
        Map<String, List<String>> wordSynonymsMap = new LinkedHashMap<>();

        for (int count = 1; count <= wordsCount; count++) {
            String word = scanner.nextLine(); //дума
            String synonym = scanner.nextLine(); //синоним

            //ако я няма -> добавяме думата с празен списък срещу нея
            wordSynonymsMap.putIfAbsent(word, new ArrayList<>());
            //ако я има -> няма да се извърши добавянето, защото тя вече има списък срещу нея

            //гарантира ни се, че имаме дадената дума -> списък със синоними
            wordSynonymsMap.get(word).add(synonym);
        }

        //запис / двойка / pair / entry: key (String word) -> value (List<String> synonyms)
        for (Map.Entry<String, List<String>> entry : wordSynonymsMap.entrySet()) {
            //всеки един запис се съхранява в entry
            //entry.getKey() -> дума
            //entry.getValue() -> списък със синоними
            String word = entry.getKey();
            List<String> synonyms = entry.getValue();
            System.out.println(word + " - " + String.join(", ", synonyms));
        }
    }
}
