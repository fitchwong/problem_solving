package com.codepicker.exercise.frogjump;

import org.junit.Assert;
import org.junit.Test;

public class FrogJumpTest {

    @Test
    public void testNormal() {
        Assert.assertEquals(3, new FrogJump().frogJump(10, 85, 30));
    }

    @Test
    public void testNoJump() {
        Assert.assertEquals(0, new FrogJump().frogJump(10, 85, 0));
    }

    @Test
    public void testLongJump() {
        Assert.assertEquals(1, new FrogJump().frogJump(10, 85, 100));
    }

    @Test
    public void testLongDistance() {
        Assert.assertEquals(Integer.MAX_VALUE, new FrogJump().frogJump(0, Integer.MAX_VALUE, 1));
    }

    @Test
    public void testNoDistance() {
        Assert.assertEquals(0, new FrogJump().frogJump(10, 10, 1));
    }

    @Test
    public void testNegativeDistance() {
        Assert.assertEquals(0, new FrogJump().frogJump(Integer.MAX_VALUE, 0, 1));
    }
}
