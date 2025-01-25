import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" "))// "2 10 3" split -> {"2","10","3"}
                .mapToInt(Integer::parseInt) // {2, 10, 3}
                .toArray();

        if (array.length == 1) {
            System.out.println(array[0]);
            return;
        }

        // докато дължината на масива е по-голяма от 1
        while (array.length > 1) {
            //създавам си празен масив с 1 елемент по-малко от "array"
            int[] condense = new int[array.length - 1];

            // обхождам всички елементи от прочетения елемент като пропускам последния
            for (int position = 0; position < array.length - 1; position++) {
                //пълня новия масив като събирам числата както е зададено по условие
                condense[position] = array[position] + array[position + 1];
            }
            // първоначалния масив става равен на новия
            array = condense;
        }

        System.out.println(array[0]);
    }
}
