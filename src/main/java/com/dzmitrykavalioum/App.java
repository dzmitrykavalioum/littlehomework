package com.dzmitrykavalioum;

import com.dzmitrykavalioum.task1.Task1;
import com.dzmitrykavalioum.task10.Task10;
import com.dzmitrykavalioum.task10.Xy;

import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Xy> list = Task10.calculateFunction(0, 2, 0.1);
        for (Xy item : list
        ) {
            System.out.println(item);
        }
    }
}
