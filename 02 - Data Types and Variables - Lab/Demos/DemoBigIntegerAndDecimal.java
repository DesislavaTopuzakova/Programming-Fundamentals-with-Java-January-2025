package DataTypesAndVariables_Lab;

import java.math.BigDecimal;
import java.math.BigInteger;

public class DemoBigIntegerAndDecimal {
    public static void main(String[] args) {
        //BigInteger - много големи цели числа
        //BigDecimal - много големи дробни числа

        //11111111111111111111111111
        BigInteger firstNumber = new BigInteger("11111111111111111111111111");
        BigInteger secondNumber = new BigInteger("999999999999999999999999");
        System.out.println(firstNumber.add(secondNumber)); //събиране на много големи цели числа
        System.out.println(firstNumber.subtract(secondNumber)); //изваждане на много големи цели числа
        System.out.println(firstNumber.multiply(secondNumber)); //умножение на много големи цели числа
        System.out.println(firstNumber.divide(secondNumber)); //деление на много големи цели числа

        //11111111111111111111111.89237486238764723
        BigDecimal decimalNumber = new BigDecimal("11111111111111111111111.89237486238764723");


    }
}
