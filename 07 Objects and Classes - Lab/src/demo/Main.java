package demo;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger num = new BigInteger("1");

        //lab.demo.Car car1 = Audi
        //lab.demo.Car car2 = Mercedes
        //lab.demo.Car car3 = BMW
        Car car = new Car(200, "Red", "BMW");

        System.out.println(car.getHorsePower());
        System.out.println(car.getColor());
        System.out.println(car.getBrand());

        car.startEngine();
        car.stopEngine();

    }
}
