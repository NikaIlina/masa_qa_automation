package lesson03;

import java.util.Scanner;

public class calc {
    public static void main(String[] args) {

        double firstnum;
        double secstnum;
        double res;

        Scanner input = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        firstnum = input.nextDouble();
        System.out.println("Введите первое число: ");
        secstnum = input.nextDouble();

        System.out.println("firstnum = " + firstnum);
        System.out.println("secstnum = " + secstnum);
        System.out.println(firstnum + "+" + secstnum + "=" + (firstnum + secstnum));
        System.out.println(firstnum + "-" + secstnum + "=" + (firstnum - secstnum));
        System.out.println(firstnum + "x" + secstnum + "=" + (firstnum * secstnum));
        System.out.println(firstnum + "%" + secstnum + "=" + (firstnum % secstnum));
        System.out.println(firstnum + "/" + secstnum + "=" + (firstnum / secstnum));
    }
}
