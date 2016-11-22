package com.codepicker.exercise.dice.gameboard;

import java.math.BigInteger;

import org.junit.Assert;
import org.junit.Test;

import com.codepicker.lib.Logger;

public class ProbabilityToGoalTest {

    /**
     * Fail Case
     */
    @Test
    public void fNegativeLoop() {
        new ProbabilityToGoal().calculateLoop(BigInteger.valueOf(-1));
    }

    /**
     * Fail Case
     */
    @Test
    public void f0Loop() {
        Assert.assertTrue(BigInteger.ZERO.equals(new ProbabilityToGoal().calculateLoop(BigInteger.ZERO)));
    }

    @Test
    public void f1Loop() {
        Assert.assertTrue(BigInteger.ONE.equals(new ProbabilityToGoal().calculateLoop(BigInteger.ONE)));
    }
    
    @Test
    public void f2Loop() {
        Assert.assertTrue(BigInteger.valueOf(2).equals(new ProbabilityToGoal().calculateLoop(BigInteger.valueOf(2))));
    }
    
    @Test
    public void f3Loop() {
        Assert.assertTrue(BigInteger.valueOf(5).equals(new ProbabilityToGoal().calculateLoop(BigInteger.valueOf(3))));
    }
    
    @Test
    public void f4Loop() {
        Assert.assertTrue(BigInteger.valueOf(8).equals(new ProbabilityToGoal().calculateLoop(BigInteger.valueOf(4))));
    }
    
    @Test
    public void f5Loop() {
        Assert.assertTrue(BigInteger.valueOf(14).equals(new ProbabilityToGoal().calculateLoop(BigInteger.valueOf(5))));
    }
    
    @Test
    public void f6Loop() {
        Assert.assertTrue(BigInteger.valueOf(25).equals(new ProbabilityToGoal().calculateLoop(BigInteger.valueOf(6))));
    }
    
    @Test
    public void f7Loop() {
        Assert.assertTrue(BigInteger.valueOf(55).equals(new ProbabilityToGoal().calculateLoop(BigInteger.valueOf(7))));
    }

    @Test
    public void f10Loop() {
        Assert.assertTrue(BigInteger.valueOf(427).equals(new ProbabilityToGoal().calculateLoop(BigInteger.TEN)));
    }

    @Test
    public void fBigNumberLoop() {
        String expectedResult = "12600232487488196670860143921776685998603210857188506456300630534411017721126622347899135862900264943836296074959329085300156960897991563037140053022330104173246718691717598851564981";
        BigInteger result = BigInteger.ZERO;
        for (int i = 0; i < expectedResult.length(); i++) {
            result = result.add(BigInteger.valueOf(Integer.parseInt(expectedResult.substring(i, i + 1))));
            if (i < expectedResult.length() - 1) {
                result = result.multiply(BigInteger.TEN);
            }
        }
        Assert.assertTrue(result.equals(new ProbabilityToGoal().calculateLoop(BigInteger.valueOf(610))));
    }

    /**
     * Fail Case
     */
    @Test
    public void fNegativeRecursive() {
        new ProbabilityToGoal().calculateRecursive(BigInteger.valueOf(-1));
    }

    /**
     * Fail Case
     */
    @Test
    public void f0Recursive() {
        Assert.assertTrue(BigInteger.ZERO.equals(new ProbabilityToGoal().calculateRecursive(BigInteger.ZERO)));
    }

    /**
     * Fail Case
     */
    @Test
    public void f1Recursive() {
        Assert.assertTrue(BigInteger.ONE.equals(new ProbabilityToGoal().calculateRecursive(BigInteger.ONE)));
    }
    
    @Test
    public void f2Recursive() {
        Assert.assertTrue(BigInteger.valueOf(2).equals(new ProbabilityToGoal().calculateRecursive(BigInteger.valueOf(2))));
    }
    
    @Test
    public void f3Recursive() {
        Assert.assertTrue(BigInteger.valueOf(5).equals(new ProbabilityToGoal().calculateRecursive(BigInteger.valueOf(3))));
    }
    
    @Test
    public void f4Recursive() {
        Assert.assertTrue(BigInteger.valueOf(8).equals(new ProbabilityToGoal().calculateRecursive(BigInteger.valueOf(4))));
    }
    
    @Test
    public void f5Recursive() {
        Assert.assertTrue(BigInteger.valueOf(14).equals(new ProbabilityToGoal().calculateRecursive(BigInteger.valueOf(5))));
    }
    
    @Test
    public void f6Recursive() {
        Assert.assertTrue(BigInteger.valueOf(25).equals(new ProbabilityToGoal().calculateRecursive(BigInteger.valueOf(6))));
    }
    
    @Test
    public void f7Recursive() {
        Assert.assertTrue(BigInteger.valueOf(55).equals(new ProbabilityToGoal().calculateRecursive(BigInteger.valueOf(7))));
    }

    @Test
    public void f10Recursive() {
        Assert.assertTrue(BigInteger.valueOf(427).equals(new ProbabilityToGoal().calculateRecursive(BigInteger.TEN)));
    }

    /**
     * Very very long processing, may cause StackOverflowException
     */
    @Test
    public void fBigNumberRecursive() {
        String expectedResult = "12600232487488196670860143921776685998603210857188506456300630534411017721126622347899135862900264943836296074959329085300156960897991563037140053022330104173246718691717598851564981";
        BigInteger result = BigInteger.ZERO;
        for (int i = 0; i < expectedResult.length(); i++) {
            result = result.add(BigInteger.valueOf(Integer.parseInt(expectedResult.substring(i, i + 1))));
            if (i < expectedResult.length() - 1) {
                result = result.multiply(BigInteger.TEN);
            }
        }
        Assert.assertTrue(result.equals(new ProbabilityToGoal().calculateRecursive(BigInteger.valueOf(610))));
    }

}
