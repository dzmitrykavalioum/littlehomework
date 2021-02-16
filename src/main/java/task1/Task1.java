package task1;


/*1.	Написать программу, позволяющую по последней цифре числа определить последнюю цифру его квадрата.
 * */

public class Task1 {
    public static int calculate(int a) {
        int b = a % 10;
        return (b * b) % 10;
    }

}