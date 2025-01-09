public class DivisibleBy3_08 {
    public static void main(String[] args) {
        //числа от 1 до 100, които се делят на 3

        //for цикъл
        //начало: 1
        //край: 100
        //повтаряме: проверка дали числото се дели на 3 -> отпечатваме
        //промяна: +1

        for (int number = 3; number <= 99; number++) {
           if (number % 3 == 0) {
               System.out.println(number);
           }
        }
    }
}
