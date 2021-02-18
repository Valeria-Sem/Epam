package by.epam.tasks.tests;

import org.junit.Assert;
import org.junit.Test;

import static by.epam.tasks.Task2.calculateDaysInMonth;
import static by.epam.tasks.Task2.isLeapYear;

public class Task2Test {

    @Test
    public void task2Test001() {
        int actual;
        int expected = 29;
        actual = calculateDaysInMonth(2020, 2);

        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void task2Test002() {
        boolean actual;
        boolean expected = true;
        actual = isLeapYear(2020);

        Assert.assertEquals(expected, actual);
    }
}
