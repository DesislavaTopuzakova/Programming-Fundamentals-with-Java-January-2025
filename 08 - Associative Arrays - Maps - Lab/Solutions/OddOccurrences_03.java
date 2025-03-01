package Maps_Lab;

import java.util.*;

public class OddOccurrences_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        Map<String, Integer> wordMap = new LinkedHashMap<>();

        for (String currentWord : input){
            String wordInLowerCase = currentWord.toLowerCase();

            wordMap.putIfAbsent(wordInLowerCase, 0);
            wordMap.put(wordInLowerCase, wordMap.get(wordInLowerCase) + 1);
        }
        List<String> resultList = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : wordMap.entrySet()){
            if (entry.getValue() % 2 != 0){
                resultList.add(entry.getKey());
            }
        }
        System.out.println(String.join(", ", resultList));
    }
}

