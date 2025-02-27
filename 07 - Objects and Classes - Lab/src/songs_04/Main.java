package songs_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countSongs = Integer.parseInt(scanner.nextLine());

        List<Song> songsCollection = new ArrayList<>();
        for (int count = 1; count <= countSongs; count++) {

            String input = scanner.nextLine(); //"{typeList}_{name}_{time}"
            String[] data = input.split("_"); //split("_") -> ["typeList","name","time"]

            String typeList = data[0];
            String name = data[1];
            String time = data[2];

            //създавам обект Song
            Song song = new Song(typeList, name, time);
            //добавям песента в колекция от песни
            songsCollection.add(song);
        }

        String command = scanner.nextLine();

        if (command.equals("all")) {
            for (Song song : songsCollection) {
                System.out.println(song.getName());
            }
        } else {
            for (Song song : songsCollection) {
                if (song.getTypeList().equals(command)) {
                    System.out.println(song.getName());
                }
            }
        }
    }
}
