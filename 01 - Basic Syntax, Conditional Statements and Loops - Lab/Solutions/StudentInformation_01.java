import java.util.Scanner;

public class StudentInformation_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. input
        String studentName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        double grade = Double.parseDouble(scanner.nextLine());

        //2. output
        //%s -> String
        //%d -> int
        //%f -> double
        //%n -> нов редь
        System.out.printf("Name: %s, Age: %d, Grade: %.2f", studentName, age, grade);

    }
}
