package by.epam.tasks.tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static by.epam.tasks.Task1.calculateSquareOfLastDigit;

@RunWith(value = Parameterized.class)
public class Task1Test {
    private final int numb;
    private final double expected;

    @Parameterized.Parameters
    public static Collection<Object[]> numbTableValues(){
        return Arrays.asList(new Object[][]{
                { 23, 9 },
                { 658, 4 }
        });
    }

    public Task1Test(int numb, double expected) {
        this.numb = numb;
        this.expected =  expected;
    }

    @Test
    public void task1Test001() {
        double actual;
        actual = calculateSquareOfLastDigit(numb);

        Assert.assertEquals(expected, actual, 0.01);
    }
}
