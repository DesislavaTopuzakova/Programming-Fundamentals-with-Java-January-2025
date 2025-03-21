package TextProcessing_Lab;

import java.util.Scanner;

public class StringVsStringBuilderDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //String
        //по-бавен при конкатенация
        //има по-малко вградени функционалности за обработка на текст
        String text = "";
        for (int i = 0; i < 1000000; i++) {
            text += "a";
            //text = text + "a";
        }
        System.out.println(text);


        //StringBuilder - притежава всички функционалности на String
        //по-бърз при конкатенация
        //има повече вградени функционалности за обработка на текст
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            sb.append("a");
            //text = text + "a";
        }
        System.out.println(sb);

    }
}
