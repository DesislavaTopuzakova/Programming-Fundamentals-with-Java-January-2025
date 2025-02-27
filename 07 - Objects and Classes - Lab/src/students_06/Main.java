package students_06;

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

            //проверявам дали студента съществува
            if (isStudentExisting(studentsList, firstName, lastName)) {
                //взимам съществуващия студент
                int index = getStudentIndex(studentsList, firstName, lastName);

                //ъпдейтваме студента
                studentsList.get(index).setAge(age);
                studentsList.get(index).setHometown(hometown);
            } else {
                //създавам обект Student
                Student student = new Student(firstName, lastName, age, hometown);
                //прибавям Student в колекция от студенти
                studentsList.add(student);
            }


            input = scanner.nextLine();
        }

        String city = scanner.nextLine();

        for (Student student : studentsList) {
            if (student.getHometown().equals(city)) {
                System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }
    }

    private static int getStudentIndex(List<Student> studentsList, String firstName, String lastName) {

        int index = -1;

        for (int i = 0; i < studentsList.size(); i++) {
            Student student = studentsList.get(i);
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                index = i;
            }
        }

        return index;
    }

    private static boolean isStudentExisting(List<Student> studentsList, String firstName, String lastName) {

        for (Student student : studentsList) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }
}
