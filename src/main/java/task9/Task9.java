package task9;
;

public class Task9 {
    private static final double PI = 3.14;
    public static Circle calculateCircle (int radius){
        Circle circle = new Circle(radius*2*PI,PI*radius*radius);
        return circle;
    }
}
