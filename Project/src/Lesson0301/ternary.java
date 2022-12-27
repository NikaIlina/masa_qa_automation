package Lesson0301;

public class ternary {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int c = 6;
        String result;

/* long version
        if (a == b) {
            result = "a and b are equel";
        }
        else {
            result = "a and b are not equal";
       }
 */ // short version:
        result = (a == b) ? "a and b are equel" : "a and b are not equal";
        System.out.println("result " + result);

    }
}
