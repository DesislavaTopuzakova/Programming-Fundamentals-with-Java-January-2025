import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int[] train = new int[size];

        int sum = 0;
        for (int wagon = 0; wagon < size; wagon++) {

            //прочитам пътниците за вагона
            train[wagon] = Integer.parseInt(scanner.nextLine());
            //сумирам пътниците от вагона в обща променлива
            sum += train[wagon];
        }

//        for (int i = 0; i < size; i++) {
//            System.out.print(array[i] + " ");
//        }
        for (int wagon : train) {
            System.out.print(wagon + " ");
        }

        System.out.println();
        System.out.println(sum);
    }
}
