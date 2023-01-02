package lesson04;

import java.util.Scanner;

public class exp_bonus {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        double bonus = 0.0;

        System.out.println("Enter your wage:");

        double wage = input.nextInt();

        System.out.println("Enter your experience:");

        int experience = input.nextInt();

        if (experience >= 0 && experience < 5) {
            bonus = wage * 0.1;
        } else if (experience >= 5 && experience < 10) {
            bonus = wage * 0.15;
        }
         else if (experience >= 10 && experience < 15) {
        bonus = wage * 0.25;
    }
        else if (experience >= 15 && experience < 20) {
            bonus = wage * 0.35;
        }
        else if (experience >= 20 && experience < 25) {
            bonus = wage * 0.45;
        }
        else if (experience >= 25 ) {
            bonus = wage * 0.5;
        }
        System.out.println("Ваш бонус = " + bonus);
        System.out.println("Ваша заплата = " + (wage + bonus));

    }
}
