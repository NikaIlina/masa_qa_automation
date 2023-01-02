package lesson04.HW;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number 0 to 100:");

        double number = input.nextInt();

        if (number >= 0 && number <= 14) {
            System.out.println("Your gap = [0 to 14]");
        }
        else if (number >= 15 && number <= 35) {
            System.out.println("Your gap = [15 to 35]");
        }
        else if (number >= 36 && number < 50) { //указала до 50 не включая
            System.out.println("Your gap = [36 to 50]");
        }
        else if (number >= 50 && number <= 100) {
            System.out.println("Your gap = [50 to 100]");
        }
        else {
            System.out.println("Wrong number");
        }
        input.close();
    }
}
