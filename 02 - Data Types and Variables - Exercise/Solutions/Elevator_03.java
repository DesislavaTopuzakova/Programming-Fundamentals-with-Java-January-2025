package Solutions;

import java.util.Scanner;

public class Elevator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int courses = 0;
        //докато имам хора ще повтарям
        while (people > 0) {

            // изваждам хората които да се качили
            people -= capacity;
            // инкрементирам курсовете с 1
            courses++;
        }

        System.out.println(courses);

    }
}
