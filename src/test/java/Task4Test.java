import com.dzmitrykavalioum.task4.Task4;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class Task4Test {
    private int a, b, c, d;
    private boolean expected;

    @Parameterized.Parameters
    public static Collection<Object> calculateTableEven()
    {
        return Arrays.asList(new Object[][]{
                {2, 3, 4, 5, true},
                {2, 2, 2, 2, true},
                {1, 3, 5, 6, false}
        });
    }

    public Task4Test (int a, int b, int c, int d, boolean expected){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.expected = expected;
    }

    @Test
    public void calculateTest(){
        boolean actual;
        actual = Task4.calculateEven(a,b,c,d);
        Assert.assertEquals(expected,actual);
    }
}
