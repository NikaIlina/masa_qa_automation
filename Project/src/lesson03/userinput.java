package lesson03;

import java.util.Locale;
import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {

        String name;
        int age;
//        double grade - можно создавать отдельно, можно в методе, как показано ниже

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        // чтобы точку вводить в числах с плавающей точкой (double) вместо запятой
        System.out.println("Please enter your name:");
        name = input.nextLine();

        System.out.println("Please enter your age:");
        age = input.nextInt();

        System.out.println("Please enter your grade:");
        double grade = input.nextDouble();
// выделить все - рефактор - интродюс вариаблес

        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("grade = " + grade);

        // age.soutv - чтобы напечатался сам System.out.println("age = " + age);

        System.out.println("Finished");
    }
}
