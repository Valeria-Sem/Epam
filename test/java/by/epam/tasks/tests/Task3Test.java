package by.epam.tasks.tests;

import org.junit.Assert;
import org.junit.Test;

import static by.epam.tasks.Task3.getAreaOfSquare;
import static by.epam.tasks.Task3.getDeltaSquare;

public class Task3Test {

    @Test
    public void task3Test001() {
        double actual;
        double expected = 12.5;
        actual = getAreaOfSquare(25);

        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void task3Test002() {
        double actual;
        double expected = 2;
        actual = getDeltaSquare(25, 12.5);

        Assert.assertEquals(expected, actual, 0.01);
    }
}
