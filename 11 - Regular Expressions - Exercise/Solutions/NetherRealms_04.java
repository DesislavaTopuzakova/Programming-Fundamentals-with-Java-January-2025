package Regex_Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetherRealms_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //входни данни
        String [] demonNames = scanner.nextLine()  //"Ivan    ,   Georgi, Peter    ,Tsetso"
                             .replace(" ","")  //"Ivan,Georgi,Peter,Tsetso"
                            .split(","); //["Ivan", "Georgi", "Peter", "Tsetso"]

        //демон: име, health, damage

        for (String demonName : demonNames) {
            //demonName -> име на демона
            //health -> живот на демона
            //damage -> сила на атака на демона
            int health = getHealth(demonName);
            double damage = getDamage(demonName);

            //модификация на damage спрямо името на демона
            for (char symbol : demonName.toCharArray()) {
                if (symbol == '*') {
                    damage *= 2;
                } else if (symbol == '/') {
                    damage /= 2;
                }
            }

            //отпечатваме информация за демона
            System.out.printf("%s - %d health, %.2f damage%n", demonName, health, damage);
        }

    }

    //метод, който изчислява и връща като резултат health на демона спрямо неговото име
    private static int getHealth(String demonName) {
        //health = сума от ascii кодовете на всички символи: [0-9], +, -, *, /
        int health = 0;
        for (char symbol : demonName.toCharArray()) {
            if (symbol != '+' && symbol != '-' && symbol != '*' && symbol != '/' && symbol != '.' && !Character.isDigit(symbol)) {
                health += (int) symbol;
            }
        }
        return health;
    }

    //метод, който изчислява и връща като резултат damage на демона спрямо неговото име
    private static double getDamage(String demonName) {
        double damage = 0;
        //damage = сумата от всички цели и дробни числа, които са положителни и отрицателни
        //demonName = "M3ph-0.5s-0.5t0.0**"
        Pattern patternNumber = Pattern.compile("\\-?[0-9]+\\.?[0-9]*");
        Matcher matcher = patternNumber.matcher(demonName);
        //matcher = ["3", "-0.5", "-0.5", "0.0"]
        while (matcher.find()) {
            damage += Double.parseDouble(matcher.group());
        }

        return damage;
    }
}
