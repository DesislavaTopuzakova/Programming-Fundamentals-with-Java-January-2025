package Maps_Lab;

import java.util.*;

public class CountRealNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                                    .mapToDouble(Double::parseDouble).toArray();
        //numbers = [8, 2, 2, 8, 2]

        //запис / двойка / pair: число (key) -> бр. срещания (value)
        Map<Double, Integer> numbersCountMap = new TreeMap<>();
        //гарантира, че записите ще се подредят по нарастващ ред на ключовете

        //обхождаме всички числа в масива
        for (double number : numbers) {
            //1. не сме го срещали до момента -> нямаме го записано
            if (!numbersCountMap.containsKey(number)) {
                //първото срещане на числото ми
                numbersCountMap.put(number, 1);
            }
            //2. вече сме го срещали -> има го записано
            else {
                int currentCount = numbersCountMap.get(number); //текущия брой на срещанията
                numbersCountMap.put(number, currentCount + 1);
            }
        }

        //принтиране на записите в map
        //numbersCountMap
        //2.0 -> 3
        //8.0 -> 2
        //запис: key (число) -> value (бр. срещания)
        for (Map.Entry<Double, Integer> entry : numbersCountMap.entrySet()) {
            //всеки един запис е съхранен в променливата entry
            //entry: key (число)     value (бр. срещания)
            //entry.getKey() -> дробното число
            //entry.getValue() -> бр. срещания
            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
