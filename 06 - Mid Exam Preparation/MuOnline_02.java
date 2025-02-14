package MidExamPrep2;

import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //начало на играта
        int health = 100;
        int bitcoins = 0;

        //въвеждаме стаите
        String roomsText = scanner.nextLine(); //"rat 10|bat 20|potion 10|rat 10|chest 100"
        String [] rooms = roomsText.split("\\|"); //["rat 10", "bat 20", "potion 10", "rat 10", "chest 100"]

        for (int position = 0; position <= rooms.length - 1; position++) {
            String currentRoom = rooms[position]; //"rat 10".split(" ") -> ["rat", "10"]

            String command = currentRoom.split(" ")[0]; //командата на стаята
            int number = Integer.parseInt(currentRoom.split(" ")[1]); //"10" -> 10 числото на стаята

            //проверка коя е командата на стаята
            switch (command) {
                case "potion" -> { //проверка дали при добавянето няма да надвишим 100
                    if (health + number > 100) {
                        //при добавяне превишавам 100 -> добавям само колкото да стигна до 100
                        number = 100 - health;
                    }
                    //трябва да си увеличим health с number
                    health += number;
                    //след увеличаването на health
                    System.out.printf("You healed for %d hp.%n", number);
                    System.out.printf("Current health: %d hp.%n", health);
                }
                case "chest" -> { //трябва да си увеличим bitcoins с number
                    bitcoins += number;
                    System.out.printf("You found %d bitcoins.%n", number);
                }
                default -> { //ако командата не е нито potion, нито chest -> стая с битка
                    //по време на битка -> намаляме health с number
                    health -= number;

                    //приключва битката
                    if (health > 0) {
                        //живи сме след битката
                        System.out.printf("You slayed %s.%n", command);
                    } else {
                        //health <= 0 -> не сме живи след битката -> играта приключва
                        System.out.printf("You died! Killed by %s.%n", command);
                        System.out.printf("Best room: %d%n", position + 1);
                        return;
                    }
                }
            }
        }

        //обходили всички стаи
        System.out.println("You've made it!");
        System.out.println("Bitcoins: " + bitcoins);
        System.out.println("Health: " + health);
    }
}
