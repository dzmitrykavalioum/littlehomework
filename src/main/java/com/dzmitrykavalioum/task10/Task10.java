package com.dzmitrykavalioum.task10;

import java.util.ArrayList;
import java.util.List;

public class Task10 {

    private static final double PRECISION = 0.001;

    public static List<Xy> calculateFunction(double a, double b, double h) {
        double y;
        List<Xy> xyList = new ArrayList<>();
        for (double i = a; i <= (b + PRECISION); i += h) {
            y = Math.tan(i);
            xyList.add(new Xy(i,y));

        }
        return xyList;
    }
}
