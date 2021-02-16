import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import task1.Task1;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class Task1Test {
    private int number;
    private int expected;

    @Parameterized.Parameters
    public static Collection<Object[]> calculateTableValues() {
        return Arrays.asList(new Object[][]{
                {9, 1},
                {1, 1},
                {2, 4},
                {10, 0},
                {31,1},
                {14,6}
        });
    }

    public Task1Test(int number, int expected){
        this.number = number;
        this.expected = expected;
    }

    @Test
    public void calculateTest(){
        long actual;

        actual = Task1.calculate(number);

        Assert.assertEquals(expected, actual);
    }
}



