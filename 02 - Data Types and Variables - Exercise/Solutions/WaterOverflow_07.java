package Solutions;

import java.util.Scanner;

public class WaterOverflow_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int capacity = 255;
        int currentLiters = 0;
        for (int i = 1; i <= n; i++) {

            int liters = Integer.parseInt(scanner.nextLine());
            if (liters <= capacity) {
                capacity -= liters;
                currentLiters += liters;
            } else {
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(currentLiters);
    }
}
