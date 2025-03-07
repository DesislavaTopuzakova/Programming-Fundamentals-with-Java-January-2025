package solutions;

import java.util.Scanner;

public class ExtractFile_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //"C:\Internal\training-internal\Template.pptx"
      /*  String path = scanner.nextLine();

        //["Internal","training-internal","Template.pptx"]
        String[] elements = path.split("\\\\");

        //File name: Template
        //File extension: pptx

        //elements[elements.length - 1].split("\\.")[0] -> "Template"
        String fileName = elements[elements.length - 1].split("\\.")[0];
        //elements[elements.length - 1].split("\\.")[1] -> "pptx"
        String extensionName = elements[elements.length - 1].split("\\.")[1];

        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + extensionName);
*/
        String input = scanner.nextLine();

        int lastSlashIndex =  input.lastIndexOf("\\");
        int dotIndex = input.lastIndexOf(".");

        String file = input.substring(lastSlashIndex + 1, dotIndex);
        String extension = input.substring(dotIndex + 1);

        System.out.println("File name: " + file);
        System.out.println("File extension: " + extension);

    }
}
