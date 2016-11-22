package com.codepicker.exercise.fibonaccinumber;

import java.math.BigInteger;

import com.codepicker.lib.Logger;

/**
 * f(0) = 0
 * f(1) = 1
 * f(n) = f(n-1) + f(n-2) where n > 1
 * @author Rayson Yeung
 */
public class FibonacciNumber {

	// Solution 2, looping calculation, using 3 pointer to shift the number
	public BigInteger calculateLoop(BigInteger number) {
		if (number.compareTo(BigInteger.valueOf(0)) < 0) {
			throw new IllegalArgumentException("number cannot be smaller than 0, found " + number);
		}

		if (number.compareTo(BigInteger.valueOf(0)) == 0) {
			return BigInteger.valueOf(0);
		}

		if (number.compareTo(BigInteger.valueOf(1)) == 0 || number.compareTo(BigInteger.valueOf(2)) == 0) {
			return BigInteger.valueOf(1);
		}

		BigInteger left = BigInteger.valueOf(1);
		BigInteger right = BigInteger.valueOf(1);
		BigInteger fibonacci = BigInteger.valueOf(1);
		for (BigInteger i = BigInteger.valueOf(3); i.compareTo(number) <= 0; i = i.add(BigInteger.valueOf(1))) {
			fibonacci = left.add(right);
			left = right;
			right = fibonacci;
		}
		Logger.log(fibonacci);
		return fibonacci;
	}

	// Solution 1, recursive function call, may cause StackOverflowException
	public BigInteger calculateRecursive(BigInteger number) {
		if (number.compareTo(BigInteger.valueOf(0)) < 0) {
			throw new IllegalArgumentException("number cannot be smaller than 0, found " + number);
		}

		if (number.compareTo(BigInteger.valueOf(0)) == 0) {
			return BigInteger.valueOf(0);
		}

		if (number.compareTo(BigInteger.valueOf(1)) == 0 || number.compareTo(BigInteger.valueOf(2)) == 0) {
			return BigInteger.valueOf(1);
		}

		return calculateRecursive(number.subtract(BigInteger.valueOf(1))).add(calculateRecursive(number.subtract(BigInteger.valueOf(2))));
	}
}
