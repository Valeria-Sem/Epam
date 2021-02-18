package by.epam.tasks.tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static by.epam.tasks.Task8.calculateFunction;

@RunWith(value = Parameterized.class)
public class Task8Test {
    private double x;
    private double expected;

    @Parameterized.Parameters
    public static Collection<Object[]> numbTableValues(){
        return Arrays.asList(new Object[][]{
                { 3, 27 },
                { 2, -1 }
        });
    }

    public Task8Test(double x, double expected) {
        this.x = x;
        this.expected =  expected;
    }

    @Test
    public void task8Test001() {
        double actual;

        actual = calculateFunction(x);

        Assert.assertEquals(expected, actual, 0.01);
    }
}
