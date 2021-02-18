package by.epam.tasks.tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static by.epam.tasks.Task5.isPerfectNumber;

@RunWith(value = Parameterized.class)
public class Task5Test {
    private int numb;
    private boolean expected;

    @Parameterized.Parameters
    public static Collection<Object[]> numbTableValues(){
        return Arrays.asList(new Object[][]{
                { 23, false },
                { 28, true },
                { 6, true },
                { 18, false }
        });
    }

    public Task5Test(int numb, boolean expected) {
        this.numb = numb;
        this.expected =  expected;
    }

    @Test
    public void task5Test001() {
        boolean actual;
        actual = isPerfectNumber(numb);

        Assert.assertEquals(expected, actual);
    }
}
