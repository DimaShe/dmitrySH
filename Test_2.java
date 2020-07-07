package L6;


import org.junit.Assert;
import org.junit.Test;
import ru.geekbrains.java3_lesson6.Task_2;

import static org.junit.Assert.assertTrue;

public class Test_2 {

    @Test
    public void arrayWithOtherFigures() {
        assertTrue("Array has other figures", Task_2.checkArray(new int[]{4, 4, 1, 1, 4, 1, 4, 1}));
    }

    @Test(expected = RuntimeException.class)
    public void arrayWith1and4() {
        Assert.assertFalse("Array has 4 and 1 only", Task_2.checkArray(new int[]{6, 4, 3}));
    }

    @Test
    public void arrayWith_1() {
        Assert.assertFalse("There is 1 in array. ", Task_2.checkArray(new int[]{17, 6, 4, 7, 9}));
    }

    @Test
    public void arrayWith_4() {
        Assert.assertFalse("There is 4 in array. ", Task_2.checkArray(new int[]{10, 15, 33, 8, 14}));
    }
}