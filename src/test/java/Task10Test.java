import com.dzmitrykavalioum.task10.Task10;
import com.dzmitrykavalioum.task10.Xy;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(value = Parameterized.class)
public class Task10Test {

    private static final double PRECISION = 0.001;
    private double a, b, h;
    private List<Xy> expectedList;

    @Parameterized.Parameters
    public static Collection<Object[]> calculateTableTan() {
        List<Xy> list = new ArrayList<Xy>();
        for (double i = 0; i <= (2 + 0.001); i += 0.1) {
            list.add(new Xy(i, Math.tan(i)));
        }
        return Arrays.asList(new Object[][]{
                {0, 2, 0.1, list}
        });
    }

    public Task10Test(double a, double b,
                      double h, List<Xy> expectedList) {
        this.a = a;
        this.b = b;
        this.h = h;
        this.expectedList = expectedList;
    }

    @Test
    public void calculateTest() {

        List<Xy> actualList;
        actualList = Task10.calculateFunction(a, b, h);

        Assert.assertEquals(expectedList.size(), actualList.size());
        for (int i = 0; i < actualList.size(); i++) {
            Assert.assertEquals(expectedList.get(i).getX(), actualList.get(i).getX(), PRECISION);
            Assert.assertEquals(expectedList.get(i).getY(), actualList.get(i).getY(), PRECISION);
        }
    }
}

