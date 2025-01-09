import java.util.Scanner;

public class DemoLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //цикъл -> използваме, когато искаме да повторим някакъв код
        //1. for цикъл -> знаем колко пъти искаме да повторим дадено действие
        //Пример: отпечатвам си името 10 пъти
        //начало: 1
        //край: 10
        //повтаряме: отпечатвам си името
        //промяна: +1
        for (int count = 1; count <= 10; count++) {
            //какво е действието, което искаме да повторим
            System.out.println("Desislava");
        }

        //2. while цикъл -> не знаем колко пъти искаме да повтаряме дадено действие
        //!!! винаги трябва променливата, от която зависи цикъла да се променя
        //стоп: number > 100
        //продължаваме: number <= 100
        //повтаряме: отпечатваме
        int number = 10;
        while (number <= 100) {
            System.out.println("Test");
            number++;
        }
    }
}
