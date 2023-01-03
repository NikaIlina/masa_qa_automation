package lesson04.HW;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        String usernamecorrect = "Admin";
        String passwordcorrect = "P@ssword";

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter your User name:");

            String username = input.nextLine();

            System.out.println("Enter your password:");

            String password = input.nextLine();

            if (username.equalsIgnoreCase(usernamecorrect) && password.equals(passwordcorrect)) {
                System.out.println("Hello, " + usernamecorrect + "!");
                break;

            } else {

                System.out.println("Wrong data! Try again, you have " +(5 - i) + " tries");
            }
        }
        input.close();
    }
}