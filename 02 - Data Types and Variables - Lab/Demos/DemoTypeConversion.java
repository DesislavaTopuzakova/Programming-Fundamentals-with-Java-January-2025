package DataTypesAndVariables_Lab;

public class DemoTypeConversion {
    public static void main(String[] args) {
        //Type Conversion - конвертиране от един тип данни в друг
        //1. implicit
        // имплицитно преобразуване
        // нямаме загуба на информация
        // преобразуваме от по-малък тип данни в по-голям
        float heightInMeters = 1.74f;
        double maxHeight = heightInMeters;

        //2. explicit
        // експлицитно преобразуване
        //имаме загуба на информация
        //преобразуваме от по-голям тип данни в по-малък
        long longNumber = 356789234;
        int number = (int) longNumber;
    }
}
