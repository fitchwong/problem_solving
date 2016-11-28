package com.codepicker.exercise.binarygap;

import org.junit.Assert;
import org.junit.Test;

public class BinaryGapTest {

    @Test
    public void fNegative() {
        new BinaryGap().calculateGap(-1);
    }

    @Test
    public void f0() {
        Assert.assertEquals(0, new BinaryGap().calculateGap(0));
    }

    @Test
    public void f9() {
        Assert.assertEquals(2, new BinaryGap().calculateGap(9));
    }
    
    @Test
    public void f15() {
        Assert.assertEquals(0, new BinaryGap().calculateGap(15));
    }
    
    @Test
    public void f20() {
        Assert.assertEquals(1, new BinaryGap().calculateGap(20));
    }
    
    @Test
    public void f529() {
        Assert.assertEquals(4, new BinaryGap().calculateGap(529));
    }
    
    @Test
    public void f1041() {
        Assert.assertEquals(5, new BinaryGap().calculateGap(1041));
    }
}
