package work.task10;

import java.text.DecimalFormat;

public class Task10 {
    private static final String FORMAT = "#0.000";
    private static final double PRECISION = 0.000001;

    public static void calculateFunction(double a, double b, double h) {
        double y;
        String formatted;
        System.out.println("\tx\t\ty");
        for (double i = a; i <= (b + PRECISION); i += h) {
            y = Math.tan(i);
            formatted = new DecimalFormat(FORMAT).format(i);
            System.out.println(formatted + "\t\t" + y);
        }
    }
}
