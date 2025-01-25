import java.util.Scanner;

public class ZigZagArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // прочитам дължината на масивите
        int n = Integer.parseInt(scanner.nextLine());

        // създавам 2 празни масива с прочетената дължина
        int[] firstArray = new int[n];
        int[] secondArray = new int[n];

        for (int row = 1; row <= n; row++) {

            // прочитам сегашния ред
            String input = scanner.nextLine();

            // сплитвам текста по празно място, получавам масив от стринг и след това достъпвам елемента по неговия индекс
            // преобразувам текста "1" в int
            int firstNumber = Integer.parseInt(input.split(" ")[0]); // ["1", "5"]
            int secondNumber = Integer.parseInt(input.split(" ")[1]);

            // правя проверка дали реда е чете или нечетен
            if (row % 2 != 0) {
                firstArray[row - 1] = firstNumber;
                secondArray[row - 1] = secondNumber;
            } else {
                firstArray[row - 1] = secondNumber;
                secondArray[row - 1] = firstNumber;
            }
        }

        for (int number : firstArray) {
            System.out.print(number + " ");
        }
        System.out.println();
        for (int number : secondArray) {
            System.out.print( number + " ");
        }
    }
}
