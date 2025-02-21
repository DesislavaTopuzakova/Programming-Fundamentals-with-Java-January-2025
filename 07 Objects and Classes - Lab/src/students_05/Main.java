package students_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Student> studentsList = new ArrayList<>();
        while (!input.equals("end")) {
            //"John Smith 15 Sofia"
            String[] data = input.split(" "); //split(" ") -> ["John","Smith","15","Sofia"]

            String firstName = data[0];
            String lastName = data[1];
            int age = Integer.parseInt(data[2]);
            String hometown = data[3];

            //създавам обект Student
            Student student = new Student(firstName, lastName, age, hometown);

            //прибавям Student в колекция от Students
            studentsList.add(student);

            input = scanner.nextLine();
        }

        String city = scanner.nextLine();

        for (Student student : studentsList) {
            //проверявам дали студента е от града който сме прочели от конзолата
            if (student.getHometown().equals(city)) {
                System.out.printf("%s %s is %d years old%n",student.getFirstName(), student.getLastName(), student.getAge());
            }
        }
    }
}
