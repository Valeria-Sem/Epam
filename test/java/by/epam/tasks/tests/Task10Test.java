package by.epam.tasks.tests;

import org.junit.Assert;
import org.junit.Test;

import static by.epam.tasks.Task10.calculateF;

public class Task10Test {

    @Test
    public void task10Test001() {
        double actual;
        double expected = 1.55740772465;
        actual = calculateF(1);

        Assert.assertEquals(expected, actual, 0.01);
    }
}
