import work.task1.Task1;
import work.task10.Task10;
import work.task10.Xy;
import work.task2.Task2;
import work.task3.Task3;
import work.task4.Task4;
import work.task5.Task5;
import work.task7.Task7;
import work.task8.Task8;
import work.task9.Task9;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println(Task1.calculate(8));
        System.out.println(Task2.daysInMonth(2000, 13));
        System.out.println(Task3.squareArea(3));
        System.out.println(Task4.calculateEven(4, 4, 2, 3));
        System.out.println(Task7.pointNearZero(0, 3, 2, 3));
        System.out.println(Task8.calculateFunction(0));
        System.out.println(Task9.calculateCircle(3));
        List<Xy> xyList = Task10.calculateFunction(1, 3, 0.1);
        for (Xy item:xyList) {
            System.out.println(item);
        }
//        Task10.calculateFunction(1, 3, 0.1);
        System.out.println(Task5.isPerfect(7));

        tests();

    }


    public static void tests() {
        if (Task1.calculate(11) == 1) {
            ok(Task1.class);
        } else {
            error(Task1.class);
        }

        if (Task1.calculate(10) == 0) {
            ok(Task1.class);
        } else {
            error(Task1.class);
        }
        if (Task1.calculate(19) == 1) {
            ok(Task1.class);
        } else {
            error(Task1.class);
        }
    }

    public static void ok(Class item) {
        System.out.println(item.getName() + " OK");
    }

    public static void error(Class item) {
        System.out.println(item.getName() + " ERROR");
    }
}

