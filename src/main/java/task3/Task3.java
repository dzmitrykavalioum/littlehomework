package task3;

import static java.lang.Math.round;
import static java.lang.Math.sqrt;

/*
 * 3.	Окружность вписана в квадрат заданной площади.
 * Найти площадь квадрата, вписанного в эту окружность.
 * Во сколько раз площадь вписанного квадрата меньше площади заданного?
 */
public class Task3 {
    public static double squareArea(double square) {
        double askingArea = 0;
        long qty; //(bigger square)/(smaller square)
        double a; //side of bigger square
        double b; //side of smaller square
        a = sqrt(square);
        b = a / (sqrt(2));
        qty = round(square / (b * b));
        System.out.println(qty);
        askingArea = square / qty;
        return askingArea;
    }

}
