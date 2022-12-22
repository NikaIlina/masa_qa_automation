package lesson03;

public class arithmetop {
    public static void main(String[] args) {

        int a = 15;
        int b = 6;

        double c = 20;
        double d = 3;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        System.out.println("c / d = " + (c / d));
        System.out.println("c % d = " + (c % d));

        double resultOfIntdounle = a * c;
        // int resultOfIntDouble = a * c - cant do operation with int where you have double
        int resultOfInt = a / b;
        System.out.println("resultOfIntdounle =" + resultOfIntdounle);

       // System.out.println("a / 0 =" + (a / 0)); - cant / 0
       // System.out.println("c / 0 =" + (c / 0)); - cant / 0
    }
}
