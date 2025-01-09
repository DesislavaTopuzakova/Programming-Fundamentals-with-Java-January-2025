import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        //Input -> scanner
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        double money = Double.parseDouble(scanner.nextLine());
        String name = scanner.nextLine();

        //Output -> System.out.println / System.out.print
        System.out.println("Desi");
        System.out.print("test");
        System.out.println("loves");

        //boolean data type
        boolean isValid = 5 < 6;

        //серия от проверки if-else if -> повече от две еднотипни проверки за една променлива и само една е валидна
        String fruit = scanner.nextLine();
        if (fruit.equals("apple")) {
            System.out.println("This is apple.");
        } else if (fruit.equals("banana")) {
            System.out.println("This is banana.");
        } else if (fruit.equals("orange")) {
            System.out.println("This is orange.");
        } else {
            System.out.println("This is not fruit.");
        }

        //switch конструкция -> няколко проверки за точни стойности, от които търсим само една валидна

        //TODO:
        //1. всички решения на задачите във fb и страницата на курса - до четвъртък
        //2. видеа на решението на всяка нерешена задача на лекцията - 4, 7, 9, 10 ,12 - до неделя
        //3. инструкции за shortcuts / live templates във fb и страница на курса
        //Facebook: Desislava Topuzakova
        //Email: desislava.topuzakova@softuni.bg


    }
}
