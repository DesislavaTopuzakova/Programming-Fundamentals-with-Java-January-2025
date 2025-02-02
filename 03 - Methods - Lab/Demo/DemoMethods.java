package Methods_Lab;

public class DemoMethods {
    //main метода - специален метод, който се изпълнява при стартиране на програмата
    public static void main(String[] args) {
      //код, който искаме да се изпълни при стартиране на програмата
        // код, който описва логиката на нашата задача
        printHello(); //извикване на метод = изпълнявате кода, който принадлежи на метода
        int a = 5;
        a += 6;
        System.out.println(a);
        printHello();
    }

    //място за създаване на методи
    //метод - наименувано парче код, което можем да използваме по всяко време в main метода
    //{access modifier: public / private} static {вид на метода} {methodName} ()
    //видове методи:
    //1. void - методи, от които не получаваме резултат, с който да работим
    //2. return - методи, от които получаваме резултат, с който да работим

    //създаване на метод
    private static void printHello () {
        //код, който принадлежи на метода
        System.out.println("Hello, Ivan!");
        System.out.println("Ivanov");
        System.out.println(26);
    }
}
