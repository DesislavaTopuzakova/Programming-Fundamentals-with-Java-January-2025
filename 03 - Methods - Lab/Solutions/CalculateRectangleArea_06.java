package Methods_Lab;

import java.util.Scanner;

public class CalculateRectangleArea_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());

        //отпечатваме лицето на правоъгълника
        int area = calculateRectangleArea(length, width);
        System.out.println(area);
    }
    //видове методи:
    //1. void - отпечатва стойности
    //2. return - връщат стойност, с която ще работим на по-късен етап

    //метод, който изчислява и връща лицето на правоъгълник
    //private static {вид на метода} {име на метода} ()
    private static int calculateRectangleArea (int a, int b) {
        //създава се променлива а = 3
        //създава се променлива b = 1.5
        //a -> дължина на правоъгълника
        //b -> широчина на правоъгълника
        return a * b;
    }
}
