package by.epam.tasks.tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static by.epam.tasks.Task6.determineTime;

@RunWith(value = Parameterized.class)
public class Task6Test {
    private int nSec;
    private String expected;

    @Parameterized.Parameters
    public static Collection<Object[]> numbTableValues(){
        return Arrays.asList(new Object[][]{
                { 23898, "6 hour 38 min 18 sec"},
                { 130, "0 hour 2 min 10 sec" }
        });
    }

    public Task6Test(int nSec, String expected) {
        this.nSec = nSec;
        this.expected =  expected;
    }

    @Test
    public void task6Test001() {
        String actual;
        actual = determineTime(nSec);

        Assert.assertEquals(expected, actual);
    }
}
