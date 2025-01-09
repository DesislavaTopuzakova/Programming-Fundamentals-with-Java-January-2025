import java.util.Scanner;

public class EvenNumber_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //while цикъл
        //повтаряме: въвеждаме цяло число
        //стоп: въведеното число е четно
        //продължаваме: въведеното число е нечетно

        int enteredNumber = Integer.parseInt(scanner.nextLine()); //въведеното число
        while (enteredNumber % 2 != 0) {
            //въведеното число е нечетно
            System.out.println("Please write an even number.");
            enteredNumber = Integer.parseInt(scanner.nextLine());
        }

        //въведеното число е четно
        System.out.println("The number is: " + Math.abs(enteredNumber));


    }
}
