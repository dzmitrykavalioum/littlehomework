import com.dzmitrykavalioum.task7.Task7;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class Task7Test {
    private int x1, y1, x2, y2;
    private int expectedIndex;

    @Parameterized.Parameters
    public static Collection<Object[]> calculationTest() {
        return Arrays.asList(new Object[][]{
                {0, 0, 0, 0, 0},
                {1, 1, 1, 1, 0},
                {1, 1, 0, 1, 1},
                {1, 10, 10, 1, 0},
                {1, 10, 9, 1, 1}
        });
    }

    public  Task7Test (int x1, int y1, int x2, int y2, int expectedIndex){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.expectedIndex = expectedIndex;

    }

    @Test
    public void calculateTest(){
        int actual;
        actual = Task7.pointNearZero(x1,y1,x2,y2);
        Assert.assertEquals(expectedIndex, actual);
    }
}
