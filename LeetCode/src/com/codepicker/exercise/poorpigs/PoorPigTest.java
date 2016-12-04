package com.codepicker.exercise.poorpigs;

import org.junit.Assert;
import org.junit.Test;

public class PoorPigTest {

    @Test
    public void testNegative() {
        new PoorPigs().poorPigs(-1, 15, 60);
    }

    @Test
    public void test0() {
        new PoorPigs().poorPigs(0, 15, 60);
    }

    @Test
    public void test1() {
        Assert.assertSame(0, new PoorPigs().poorPigs(1, 15, 60));
    }

    @Test
    public void test1000() {
        Assert.assertSame(5, new PoorPigs().poorPigs(1000, 15, 60));
    }
}
