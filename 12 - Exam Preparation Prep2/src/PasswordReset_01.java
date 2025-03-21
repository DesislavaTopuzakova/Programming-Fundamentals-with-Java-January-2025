import java.util.Scanner;

public class PasswordReset_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder input = new StringBuilder(scanner.nextLine());

        String command = scanner.nextLine();
        while (!command.equals("Done")) {

            //TakeOdd
            if (command.contains("TakeOdd")) {
                //създавам един празен стринг билдър
                StringBuilder newPassword = new StringBuilder();
                for (int i = 1; i < input.length(); i += 2) {
                    //взимам всички сомволи на нечетна позиция и ги конкатенирам към стринг билдър
                    newPassword.append(input.charAt(i));
                }
                input = newPassword;
                System.out.println(input);
            }

            //Cut
            if (command.contains("Cut")) {
                int startIndex = Integer.parseInt(command.split(" ")[1]);
                int countSymbols = Integer.parseInt(command.split(" ")[2]);

                if (startIndex >= 0 && startIndex < input.length()) {

                    for (int i = 1; i <= countSymbols; i++) {
                        input.replace(startIndex, startIndex + 1, "");
                    }

                    System.out.println(input);
                }
            }

            //Substitute
            if (command.contains("Substitute")) {

                String stringToReplace = command.split(" ")[1];
                String stringToAdd = command.split(" ")[2];

                String password = input.toString();
                if (password.contains(stringToReplace)) {

                    String newPassword = password.replace(stringToReplace, stringToAdd);

                    input = new StringBuilder(newPassword);

                    System.out.println(newPassword);
                } else {
                    System.out.println("Nothing to replace!");
                }
            }

            command = scanner.nextLine();
        }

        System.out.printf("Your password is: %s", input);
    }
}
