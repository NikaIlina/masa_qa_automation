package Lesson0301;

import java.util.Scanner;

public class checknumb {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);

        number = input.nextInt();

        if (number % 2 ==0) {
            System.out.println(number + " четное");
        }
        else  {
            System.out.println(number + " нечетное");
        }
        }
}
