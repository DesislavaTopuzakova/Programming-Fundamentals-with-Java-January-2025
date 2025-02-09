package Lists_Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DemoSorting {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(50, 34, 1, 23, 0, 98, 12));

        //нарастващ ред / ascending order
        Collections.sort(numbers);
        //numbers = {0, 1, 12, 23, 34, 50, 98}

        //намаляващ ред / descending order
        Collections.sort(numbers);  //numbers = {0, 1, 12, 23, 34, 50, 98}
        Collections.reverse(numbers); //numbers = {98, 50, 34, 23, 12, 1, 0}
    }
}
