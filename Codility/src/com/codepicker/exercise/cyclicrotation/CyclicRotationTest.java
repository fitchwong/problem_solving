package com.codepicker.exercise.cyclicrotation;

import org.junit.Assert;
import org.junit.Test;

public class CyclicRotationTest {

    @Test
    public void testEmpty() {
        Assert.assertArrayEquals(new int[] {}, new CyclicRotation().rotate(new int[] {}, 3));
    }

    @Test
    public void testSingle() {
        Assert.assertArrayEquals(new int[] { 5 }, new CyclicRotation().rotate(new int[] { 5 }, 3));
    }

    @Test
    public void testExample() {
        Assert.assertArrayEquals(new int[] { 9, 7, 6, 3, 8 }, new CyclicRotation().rotate(new int[] { 3, 8, 9, 7, 6 }, 3));
    }

    @Test
    public void testDouble() {
        Assert.assertArrayEquals(new int[] { 8, 3 }, new CyclicRotation().rotate(new int[] { 3, 8 }, 5));
    }

    @Test
    public void testNegative() {
        Assert.assertArrayEquals(new int[] { 8, 3 }, new CyclicRotation().rotate(new int[] { 3, 8 }, -51));
    }
}
