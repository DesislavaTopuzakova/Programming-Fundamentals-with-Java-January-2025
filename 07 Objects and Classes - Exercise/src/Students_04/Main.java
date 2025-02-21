package Students_04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Student> students = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            //"Lakia Eason 3.90" .split(" ") -> ["Lakia","Eason","3.90"]
            String[] input = scanner.nextLine().split(" ");
            String firstName = input[0]; // "Lakia"
            String lastName = input[1]; // "Eason"
            double grade = Double.parseDouble(input[2]); // 3.90

            Student student = new Student(firstName, lastName, grade);

            students.add(student);
        }

        //Comparator.comparing - подреждам във възходящ ред -> .reversed() ще ги обърне
        students.sort(Comparator.comparing(Student::getGrade).reversed());

        for (Student student : students) {
            System.out.printf("%s %s: %.2f\n", student.getFirstName(), student.getLastName(), student.getGrade());
        }
    }
}
