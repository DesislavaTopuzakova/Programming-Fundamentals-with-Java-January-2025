import java.util.Scanner;

public class VowelsCount_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // прочитам текст от конзолата и го правя на малки букви
        String text = scanner.nextLine().toLowerCase();

        int countVowels = getVowelsCount(text);

        System.out.println(countVowels);
    }

    // създавам си мето който връша цяло число и приема стринг параметър
    private static int getVowelsCount(String input) {

        int count = 0;
        for (char symbol : input.toCharArray()) {

            if (symbol == 'a' || symbol == 'o' || symbol == 'e' || symbol == 'i' || symbol == 'u') {
                count++;
            }
        }

        return count;
    }
}
