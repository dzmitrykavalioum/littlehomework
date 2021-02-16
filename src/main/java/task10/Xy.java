package task10;

import java.text.DecimalFormat;

public class Xy {

    private final String FORMAT = "#0.000";
    double x;
    double y;

    public Xy(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {

        String formatted;
        formatted = new DecimalFormat(FORMAT).format(x);
        return formatted + "\t" + y;
    }
}
