package lesson03;

public class IncrementDecrement {
    public static void main(String[] args) {

        int a = 5;
        System.out.println("a = " + a);
        a = a + 1;
        System.out.println("a = " + a);

        a+= 5;
        System.out.println("a = " + a);

        a = a + 1;
        System.out.println("a = " + a);

        a += 1;
        System.out.println("a = " + a);

        a++;
        System.out.println("a = " + a);

        a--;
        System.out.println("a = " + a);

       // System.out.println("a = " + a++); - увеличится
       // System.out.println("a = " + a); - присвоится
      //  System.out.println("a = " + ++a); - увеличится и присвоится

    }
}
