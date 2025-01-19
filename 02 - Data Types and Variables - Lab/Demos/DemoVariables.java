package DataTypesAndVariables_Lab;

public class DemoVariables {
    public static void main(String[] args) {
        //1. variable scope - мястото, на което мога да достъпвам моята променлива
        //2. variable lifetime - колко време съществува нашата променлива
        //3. variable span - колко време минава от създаването на променливата на променивата и нейното използване
        for (int i = 0; i < 10; i++)  {
            String inner = "I'm inside the loop";
            {
                System.out.println(inner);
            }
        }

        String out = "I'm inside the Main()";
        System.out.println(out);
        //System.out.println(inner); Error
    }
}
