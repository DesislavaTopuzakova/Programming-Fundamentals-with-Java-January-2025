package Solutions;

import java.util.Scanner;

public class PokeMon_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int factor = Integer.parseInt(scanner.nextLine());

        int initialPower = power;// начална сила
        int countPokes = 0;
        //повтораряме:
        // докато имам сила ще свъчквам покемони
        while (power >= distance) {

            // измнавам разстоянието за сръчкване
            power -= distance;

            // отброявам свъчкванията
            countPokes++;

            //ако силата ми е точно на половина на началната и фактора не е равен на нула
            // ше разделя силата по фактора
            if (power == initialPower / 2 && factor != 0) {
                power = power / factor;
            }
        }
        System.out.println(power);
        System.out.println(countPokes);
    }
}
