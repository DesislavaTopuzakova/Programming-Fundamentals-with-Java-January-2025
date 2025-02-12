package MidExamPrep1;

import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialEnergy = Integer.parseInt(scanner.nextLine());
        //повтаряме: въвеждане входни данни ("End of battle" или разстояние до врага "76")
        //стоп: входни данни == "End of battle"
        //продължаваме: входни данни != "End of battle"

        int countBattlesWon = 0; //брой на спечелените битки

        String input = scanner.nextLine();
        while (!input.equals("End of battle")) {
            //входните данни са разстояние до врага (число под формата на текст)
            //input = "76"
            int distanceToEnemy = Integer.parseInt(input);
            //distanceToEnemy - разстоянието до врага = енергията, която хабим, за да стигнем до врага

            //атака
            if (initialEnergy >= distanceToEnemy) {
                //отиваме до врага
                initialEnergy -= distanceToEnemy;
                //нападаме го и побеждаваме
                countBattlesWon++;
            } else { //initialEnergy < distanceToEnemy
                //не можем да стигнем до врага и да направим атака
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", countBattlesWon, initialEnergy);
                return; //пркратява цялата програма
            }

            //проверяваме дали няма да получим допълнителна енергия
            if (countBattlesWon % 3 == 0) {
                initialEnergy += countBattlesWon;
            }


            input = scanner.nextLine();
        }

        System.out.printf("Won battles: %d. Energy left: %d", countBattlesWon, initialEnergy);
    }
}
