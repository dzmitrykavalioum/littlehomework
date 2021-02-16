package task7;

public class Task7 {
    public static String pointNearZero(int x1, int y1, int x2, int y2) {
        double distance1 = Math.sqrt(x1 * x1 + y1 * y1);
        double distance2 = Math.sqrt(x2 * x2 + y2 * y2);
        if (distance1 <= distance2) {
            return "First";
        } else {
            return "Second";
        }


    }
}
