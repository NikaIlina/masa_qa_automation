package lesson05;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class random {

    public static void main(String[] args) {

        Random random = new Random();
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();

        int randomInteger = random.nextInt();
        int randomIntegerwb = random.nextInt(10); //задаем от 0 до определенного числа
        double randomDouble = random.nextDouble();

        System.out.println("randomInteger = " + randomInteger);
        System.out.println("randomDouble = " + randomDouble);
        System.out.println("randomIntegerwb = " + randomIntegerwb);


        int randomIntwb = threadLocalRandom.nextInt(-100, 20); // ограничение значений
        System.out.println("randomIntwb = " + randomIntwb);
    }
}
