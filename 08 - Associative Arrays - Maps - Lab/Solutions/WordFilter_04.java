package Maps_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class WordFilter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = Arrays.stream(scanner.nextLine()   //"kiwi orange banana apple".split(" ")
                                         .split(" "))  //["kiwi", "orange", "banana", "apple"]
                                         .filter(word -> word.length() % 2 == 0) //["kiwi", "orange", "banana"]
                                         .toArray(String[] :: new);

        //words -> масив от думи, които са с четна дължина
        //words = ["kiwi", "orange", "banana"]

        //начин 1: foreach
        for (String word : words) {
            System.out.println(word);
        }

        //начин 2: StreamAPI
        //Arrays.stream(words).forEach(System.out::println);

    }
}
