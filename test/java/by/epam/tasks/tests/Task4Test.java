package by.epam.tasks.tests;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static by.epam.tasks.Task4.isPositiveNumbers;

public class Task4Test {

    @Test
    public void task4Test001() {
        boolean actual;
        boolean expected = true;

        List<Integer> sequence = new ArrayList<>();
        sequence.add(6);
        sequence.add(15);
        sequence.add(8);
        sequence.add(-5);

        actual = isPositiveNumbers(sequence);

        Assert.assertEquals(expected, actual);
    }
}
