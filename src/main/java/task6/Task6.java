package task6;

public class Task6 {
    private static final int SECONDS_IN_HOUR = 3600;
    private static final int SECONDS_IN_MINUTE = 60;

    public static int getHours(int seconds) {
        return seconds / SECONDS_IN_HOUR;
    }

    public static int getMinutes(int seconds) {
        return seconds % SECONDS_IN_HOUR / SECONDS_IN_MINUTE;
    }

    public static int getSeconds(int seconds) {
        return seconds % SECONDS_IN_MINUTE - 1;
    }

}
