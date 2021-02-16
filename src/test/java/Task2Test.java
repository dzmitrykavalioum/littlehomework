import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import task2.Task2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class Task2Test {
    private int year;
    private int month;
    private int expectedDay;

    @Parameterized.Parameters
    public static Collection<Object[]> calculateTableDays(){
        return Arrays.asList(new Object[][]{
                {1988,1,31},
                {2000,2,29}
        });
    }

    public Task2Test (int year, int month,int expectedDay){
        this.year = year;
        this.month = month;
        this.expectedDay = expectedDay;
    }

    @Test
    public void calculateTest(){
        int actual;
        actual = Task2.daysInMonth(year,month);
        Assert.assertEquals(expectedDay,actual);
    }


}
