import java.util.Scanner;

public class CommonElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // прочитам първи масив
        String[] firstArray = scanner.nextLine().split(" ");
        // прочитам втори масив
        String[] secondArray = scanner.nextLine().split(" ");

        // обхождам втория масив
        for (int position = 0; position < secondArray.length; position++) {

            // запазвам всеки един стрин в променлива
            String currentText = secondArray[position];

            // обхождам първия масив
            for (int index = 0; index < firstArray.length; index++) {

                // проверявам дали currentText е равна на една от стойностите в първия масив
                if (currentText.equals(firstArray[index])) {
                    System.out.print(currentText + " ");
                }
            }
        }
    }
}
