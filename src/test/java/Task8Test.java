import com.dzmitrykavalioum.task8.Task8;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class Task8Test {
    private double x;
    private double expectedY;

    @Parameterized.Parameters
    public static Collection<Object[]> calculateTableY(){
        return Arrays.asList(new Object[][]{
                {1,-0.2},
                {3,9.0},
                {4,5.0}
        });
    }

    public Task8Test(double x, double expectedY){
        this.x = x;
        this.expectedY = expectedY;
    }

    @Test
    public  void calculateTest(){
        double delta = 0.001;
        double actual;
        actual = Task8.calculateFunction(x);
        Assert.assertEquals(expectedY,actual,delta);
    }
}
