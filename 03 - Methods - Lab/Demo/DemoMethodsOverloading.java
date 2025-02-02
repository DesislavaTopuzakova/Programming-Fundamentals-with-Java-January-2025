package Methods_Lab;

import java.util.Scanner;

public class DemoMethodsOverloading {
    public static void main(String[] args) {
        print(8);
        print("Ivan");
        print(5.60);
    }

    //сигнатура на метод = име на метода + параметри
    //!!! не можем да имаме методи с еднакви сигнатури !!!
    public static void print(int number) {
        System.out.println(number);
    }

    public static void print(String text) {
        System.out.println(text);
    }

    private static void print(double price) {
        System.out.println(price);
    }

}
