package Arrays_Lab;

public class DemoArrayIteration {
    public static void main(String[] args) {
        //обхождане на масив
        int [] numbers = {45, 67, 87, 23, 13, 46};

        //1. for цикъл -> обхождане на всички позиции от първата (0) до последната (дължина - 1)
        //използваме for цикъл, когато искаме да обходим всички елементи в масива
        // и имаме зависимост / работа от позицията на всеки елемент
        for (int position = 0; position <= numbers.length - 1; position++) {
            //какво искаме да повторим за всяка една валидна позиция в масива
            int number = numbers[position];
            if (position == 0) {
                System.out.println("This is the first element in the array!");
            } else if (position == numbers.length - 1) {
                System.out.println("This is the last element in the array!");
            }
            System.out.println(number);
        }

        //2. foreach цикъл -> обхождане на колекции
        //използваме foreach цикъл, когато искаме да обходим всички елементи на масива, започвайки от първия до последния
        //и не ни интересуват позициите им
        for (int number : numbers) {
            //какво е действието, което искаме да повторим за всеки един елемент от масива
            System.out.println(number);
        }

    }
}
