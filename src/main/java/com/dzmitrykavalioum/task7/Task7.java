package com.dzmitrykavalioum.task7;

public class Task7 {
    public static int pointNearZero(int x1, int y1, int x2, int y2) {
        int index = 0;
        double distance1 = Math.sqrt(x1 * x1 + y1 * y1);
        double distance2 = Math.sqrt(x2 * x2 + y2 * y2);
        if (distance1 > distance2) {
            index = 1;
        }
        return index;



    }
}
