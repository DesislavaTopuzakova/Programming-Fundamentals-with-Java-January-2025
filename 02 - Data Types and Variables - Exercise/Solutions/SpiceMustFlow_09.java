package Solutions;

import java.util.Scanner;

public class SpiceMustFlow_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // изначален добив на ден
        int yield = Integer.parseInt(scanner.nextLine());

        int days = 0;
        int spice = 0;
        //докато добива на полето е 100 или пвече
        while (yield >= 100) {

            // добив на ден
            spice += yield;

            // от добива за деня изваждам 26 подправки за работниците
            spice -= 26;

            // намалявам добива на полето с 10
            yield -= 10;

            // отброявам дните
            days++;
        }

        if (spice < 26) {
            spice = 0;
        } else {
            spice -= 26;
        }

        System.out.println(days);
        System.out.println(spice);
    }
}
