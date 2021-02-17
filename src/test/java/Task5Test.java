import com.dzmitrykavalioum.task5.Task5;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class Task5Test {
    private int number;
    private boolean expected;

    @Parameterized.Parameters
    public static Collection<Object> calculateTablePerfect(){
        return Arrays.asList(new Object [][]{
                {6,true},
                {7,false},
                {28,true},
                {496, true},
                {8128,true},
                {1000,false}
        });
    }

    public Task5Test (int number, boolean expected){
        this.number = number;
        this.expected = expected;
    }

    @Test
    public void calculateTest(){
        boolean actual;
        actual = Task5.isPerfect(number);
        Assert.assertEquals(expected,actual);
    }
}
