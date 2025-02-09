package Lists_Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        //input = "1 2 3 |4 5 6 |  7  8".split("|") -> ["1 2 3 ", "4 5 6 ", "  7  8"]

        List<String> texts = Arrays.stream(input.split("\\|")).collect(Collectors.toList());
        //texts = {"1 2 3 ", "4 5 6 ", "  7  8"}
        Collections.reverse(texts);
        //texts = {"  7  8", "4 5 6 ", "1 2 3 "}

        for (String text : texts) {
            //text = "  7  8".trim() -> "7  8".replaceAll("\\s+", " ") -> "7 8"
            // \\s+ -> един или повече интервали
            if (text.equals("") || text.equals(" ")) {
                continue;
            }
            System.out.print(text.trim().replaceAll("\\s+", " ") + " ");
        }

    }
}
