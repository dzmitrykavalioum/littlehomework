package task2;

/*
2.	Составить программу, которая по заданным году и номеру месяца определяет
количество дней в этом месяце и корректно определялись все високосные года.
 */
public class Task2 {

    public static int daysInMonth(int year, int month) {
        if (month < 1 || month > 12) {
            return 0;
        }
        if (month == 2) {
            if (year % 4 == 0) {
                return 29;
            } else {
                return 28;
            }
        } else {
            if (month <= 7) {
                if (month % 2 == 0) {
                    return 30;
                } else {
                    return 31;
                }
            } else {
                if (month % 2 == 0) {
                    return 31;
                } else {
                    return 30;
                }
            }
        }
    }

}
