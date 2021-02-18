package by.epam.tasks.tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static by.epam.tasks.Task7.calculatePointCoordinates;

@RunWith(value = Parameterized.class)
public class Task7Test {
    private double x;
    private double y;
    private double expected;

    @Parameterized.Parameters
    public static Collection<Object[]> numbTableValues(){
        return Arrays.asList(new Object[][]{
                { 3, 4, 5 },
                { 0, 1, 1 }
        });
    }

    public Task7Test(double x, double y, double expected) {
        this.x = x;
        this.y = y;
        this.expected =  expected;
    }

    @Test
    public void task7Test001() {
        double actual;
        actual = calculatePointCoordinates(x, y);

        Assert.assertEquals(expected, actual, 0.01);
    }
}
