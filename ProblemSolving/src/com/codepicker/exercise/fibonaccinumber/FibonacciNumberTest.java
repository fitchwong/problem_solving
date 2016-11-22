package com.codepicker.exercise.fibonaccinumber;

import java.math.BigInteger;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciNumberTest {

	/**
	 * Fail Case
	 */
	@Test
	public void fNegativeLoop() {
		new FibonacciNumber().calculateLoop(BigInteger.valueOf(-1));
	}

	@Test
	public void f0Loop() {
		Assert.assertTrue(BigInteger.ZERO.equals(new FibonacciNumber().calculateLoop(BigInteger.ZERO)));
	}

	@Test
	public void f1Loop() {
		Assert.assertTrue(BigInteger.ONE.equals(new FibonacciNumber().calculateLoop(BigInteger.ONE)));
	}

	@Test
	public void f10Loop() {
		Assert.assertTrue(BigInteger.valueOf(55).equals(new FibonacciNumber().calculateLoop(BigInteger.TEN)));
	}

	@Test
	public void fBigNumberLoop() {
		String expectedResult = "139423224561697880139724382870407283950070256587697307264108962948325571622863290691557658876222521294125";
		BigInteger result = BigInteger.ZERO;
		for (int i = 0; i < expectedResult.length(); i++) {
			result = result.add(BigInteger.valueOf(Integer.parseInt(expectedResult.substring(i, i + 1))));
			if (i < expectedResult.length() - 1) {
				result = result.multiply(BigInteger.TEN);
			}
		}
		Assert.assertTrue(result.equals(new FibonacciNumber().calculateLoop(BigInteger.valueOf(500))));
	}

	/**
	 * Fail Case
	 */
	@Test
	public void fNegativeRecursive() {
		new FibonacciNumber().calculateRecursive(BigInteger.valueOf(-1));
	}

	@Test
	public void f0Recursive() {
		Assert.assertTrue(BigInteger.ZERO.equals(new FibonacciNumber().calculateRecursive(BigInteger.ZERO)));
	}

	@Test
	public void f1Recursive() {
		Assert.assertTrue(BigInteger.ONE.equals(new FibonacciNumber().calculateRecursive(BigInteger.ONE)));
	}

	@Test
	public void f10Recursive() {
		Assert.assertTrue(BigInteger.valueOf(55).equals(new FibonacciNumber().calculateRecursive(BigInteger.TEN)));
	}

	/**
	 * Very very long processing, may cause StackOverflowException
	 */
	@Test
	public void fBigNumberRecursive() {
		String expectedResult = "139423224561697880139724382870407283950070256587697307264108962948325571622863290691557658876222521294125";
		BigInteger result = BigInteger.ZERO;
		for (int i = 0; i < expectedResult.length(); i++) {
			result = result.add(BigInteger.valueOf(Integer.parseInt(expectedResult.substring(i, i + 1))));
			if (i < expectedResult.length() - 1) {
				result = result.multiply(BigInteger.TEN);
			}
		}
		Assert.assertTrue(result.equals(new FibonacciNumber().calculateRecursive(BigInteger.valueOf(500))));
	}
}
