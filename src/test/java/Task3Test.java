import com.dzmitrykavalioum.task3.Task3;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class Task3Test {
    private double square;
    private double expectedArea;

    @Parameterized.Parameters
    public static Collection<Object[]> calculateTableArea() {
        return Arrays.asList(new Object[][]{
                {4.0, 2.0},
                {5.0, 2.5},
                {1.0, 0.5}
        });

    }

    public Task3Test(double square, double expectedArea) {
        this.square = square;
        this.expectedArea = expectedArea;
    }

    @Test
    public void calculateTest() {
        double actual;
        actual = Task3.squareArea(square);

        Assert.assertEquals(expectedArea, actual, 0.0001);
    }

}
