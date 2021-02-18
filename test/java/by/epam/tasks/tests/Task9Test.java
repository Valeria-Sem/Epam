package by.epam.tasks.tests;

import org.junit.Assert;
import org.junit.Test;

import static by.epam.tasks.Task9.calculateAreaOfCircle;
import static by.epam.tasks.Task9.calculateLengthOfCircle;

public class Task9Test {

    @Test
    public void task9Test001() {
        double actual;
        double expected = 1963.4954084936207;
        actual = calculateAreaOfCircle(25);

        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void task9Test002() {
        double actual;
        double expected = 157.07963267948966;
        actual = calculateLengthOfCircle(25);

        Assert.assertEquals(expected, actual, 0.01);
    }
}
