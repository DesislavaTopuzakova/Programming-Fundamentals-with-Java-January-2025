package demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        Animal animal = new Animal("Cooper", "dog", 7);

        System.out.printf("My pet is called - %s%n", animal.getName());
        System.out.printf("My pet is a - %s\n", animal.getType());
        System.out.printf("My pet is %d years old\n", animal.getAge());

        animal.setAge(8);

        System.out.printf("My pet is a - %d\n", animal.getAge());

        String car = "car";
        System.out.println(car.toUpperCase());


    }
}
