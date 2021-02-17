import com.dzmitrykavalioum.task6.Task6;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class Task6Test {
    private int seconds;
    private int expectedHours;
    private int expectedMinutes;
    private int expectedSeconds;

    @Parameterized.Parameters
    public static Collection<Object[]> calculateTableTime() {
        return Arrays.asList(new Object[][]{
                {1, 0, 0, 0},
                {62, 0, 1, 1},
                {1831, 0, 30, 30},
                {1, 0, 0, 0},
                {0, 0, 0, 0},
                {3700, 1, 1, 39}

        });
    }
    public Task6Test (int seconds, int expectedHours,
                      int expectedMinutes, int expectedSeconds){
        this.seconds = seconds;
        this.expectedHours = expectedHours;
        this.expectedMinutes = expectedMinutes;
        this.expectedSeconds = expectedSeconds;
    }

    @Test
    public void calculateTest(){
        int actualHours;
        int actualMinutes;
        int actualSeconds;
        actualHours = Task6.getHours(seconds);
        actualMinutes = Task6.getMinutes(seconds);
        actualSeconds = Task6.getSeconds(seconds);
        Assert.assertEquals(expectedHours, actualHours);
        Assert.assertEquals(expectedMinutes, actualMinutes);
        Assert.assertEquals(expectedSeconds, actualSeconds);
    }
}
