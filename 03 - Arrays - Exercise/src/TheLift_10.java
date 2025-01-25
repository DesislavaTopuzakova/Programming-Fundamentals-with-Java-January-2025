import java.util.Arrays;
import java.util.Scanner;

public class TheLift_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int[] lift = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean availableSpace = true;
        //ще итерирам по всички кабини в масива
        for (int cabin = 0; cabin <= lift.length - 1; cabin++) {
            int currentCabin = lift[cabin];

            //докато в сегашната кабина има по-малк от 4 човека и има хора които чакат ще добавям по един докато станат 4
            while (currentCabin < 4 && people > 0) {
                currentCabin++;
                people--;
            }
            //слагам сегашната кабина в масива
            lift[cabin] = currentCabin;

            //проверявам дали сегашната кабира е останала без място
            if (currentCabin == 4) {
                availableSpace = false;
            } else {
                availableSpace = true;
            }
        }

        if (availableSpace) {
            System.out.println("The lift has empty spots!");
            for (int cabin : lift) {
                System.out.print(cabin + " ");
            }
        } else if (people == 0) {
            for (int cabin : lift) {
                System.out.print(cabin + " ");
            }
        } else {
            System.out.printf("There isn't enough space! %s people in a queue!%n",people);
            for (int cabin : lift) {
                System.out.print(cabin + " ");
            }
        }

    }
}
