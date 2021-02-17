import com.dzmitrykavalioum.task9.Circle;
import com.dzmitrykavalioum.task9.Task9;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class Task9Test {
    private int radius;
    private double expectedLength;
    private double expectedArea;

    @Parameterized.Parameters
    public static Collection<Object[]> calculateTableCircle(){
        return Arrays.asList(new Object[][]{
                {1,6.28,3.14},
                {2,12.56,12.56},
                {0,0,0}

        });
    }

    public Task9Test (int radius, double expectedLength,double expectedArea){
        this.radius = radius;
        this.expectedArea = expectedArea;
        this.expectedLength = expectedLength;
    }

    @Test
    public void calculateTest(){
        double delta = 0.01;
        double actualLength;
        double actualArea;
        Circle circle = Task9.calculateCircle(radius);
        actualArea = circle.getArea();
        actualLength = circle.getLength();
        Assert.assertEquals(expectedLength, actualLength,delta);
        Assert.assertEquals(expectedArea, actualArea,delta);
    }

}
