package lesson04.HW;

public class Average {
    public static void main(String[] args) {
        double sum = 0;
        double average = 0;

        for (int i = 0; i <= 100 ; i++) {
            sum += i;
            average = (sum / i);
        }
        System.out.println("Sum of numbers = " + sum);
        System.out.println("Average = " + average);
    }
}
