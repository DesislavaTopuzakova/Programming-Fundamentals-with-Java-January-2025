package Solutions;

import java.util.Scanner;

public class BeerKegs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double biggestKegVolume = 0;
        String biggestKegModel = "";
        // обхождаме/прочитаме информацията за всички кегове
        // - моде, радиус, височина
        for (int i = 1; i <= n; i++) {

            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            // намирам обема на кег: π * r^2 * h.
            double volume = Math.PI * Math.pow(radius, 2) * height;

            // проверявам дали обема на кега е най-голям
            if (volume > biggestKegVolume) {
                biggestKegVolume = volume;
                biggestKegModel = model;
            }
        }

        System.out.println(biggestKegModel);
    }
}
