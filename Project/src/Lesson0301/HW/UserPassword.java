package Lesson0301.HW;

import java.util.Scanner;
// Task 2
public class UserPassword {
    public static void main(String[] args) {

        String usernamecorrect = "Admin";
        String passwordcorrect = "P@ssword";

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your User name:");

        String username = input.nextLine();

        if (username.equalsIgnoreCase(usernamecorrect)) {
            System.out.println("Enter your password:");

            String password = input.nextLine();

            if (password.equals(passwordcorrect)) {
                System.out.println("Hello " + username + " you have logged in successfully!");
            }
            else {
                System.out.println("Wrong password");
            }
        }
        else {
            System.out.println("User doesn't exist");

        }

    }
}
