package com.dzmitrykavalioum.task9;
;

public class Task9 {
    private static final double PI = Math.PI;
    public static Circle calculateCircle (int radius){
        Circle circle = new Circle(radius*2*PI,PI*radius*radius);
        return circle;
    }
}
