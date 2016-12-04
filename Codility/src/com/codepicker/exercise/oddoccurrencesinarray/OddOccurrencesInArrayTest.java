package com.codepicker.exercise.oddoccurrencesinarray;

import org.junit.Assert;
import org.junit.Test;

public class OddOccurrencesInArrayTest {

    @Test
    public void testEmpty() {
        Assert.assertSame(0, new OddOccurrencesInArray().oddOccurrencesInArray(new int[] {}));
    }

    @Test
    public void test1() {
        Assert.assertSame(1, new OddOccurrencesInArray().oddOccurrencesInArray(new int[] { 1 }));
    }

    @Test
    public void test3() {
        Assert.assertSame(3, new OddOccurrencesInArray().oddOccurrencesInArray(new int[] { 1, 3, 1 }));
    }
}
