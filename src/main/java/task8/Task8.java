package task8;

public class Task8 {
    public static double calculateFunction(double x) {
        double denominator;
        if (x >= 3) {
            return (-1) * x * x + 3 * x + 9;
        } else {
            denominator = Math.pow(x, 3) - 6;
            if (denominator != 0) {
                return 1 / denominator;
            } else {
                return 0;// error: denominator = 0
            }
        }
    }
}
