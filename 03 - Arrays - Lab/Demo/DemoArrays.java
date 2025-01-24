package Arrays_Lab;

public class DemoArrays {
    public static void main(String[] args) {
        int percentSales = 45;
        int percentSalaries = 34;
        int percentExpenses = 70;
        int percentBonuses = 56;

        //масив - структура от данни, в която съхраняваме съвкупност от еднотипни елементи
        int [] percents = {45, 34, 70, 56}; //целочислен масив
        double [] prices = {45.7, 12.3, 98.7, 45}; //дробен масив
        String [] names = {"Desi", "Ivan", "Georgi"}; //текстов масив

        //празен масив - винаги трябва да му зададем дължина
        int [] numbers = new int[4];

        //задаване на стойност на позиция в масив
        numbers[0] = 96;
        numbers[1] = 12;

        //дължина на масив = броя на елементите, които имаме в него
        System.out.println(names.length);
        int length = percents.length;

        //позиции / индекс в масив
        //позиция 0 -> винаги стои първия елемент
        //позиция дължина - 1 -> винаги стои последния елемент
        System.out.println(prices[0]);
        double price = prices[1];
        System.out.println(prices[prices.length - 1]);

        //достъпване на невалидна позиция
        //валидна позиции: 0 до последната (дължина - 1)
        System.out.println(prices[5]);
        prices[10] = 89;
    }
}
