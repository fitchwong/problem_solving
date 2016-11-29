package com.codepicker.exercise.coinchange;

import org.junit.Assert;
import org.junit.Test;

public class CoinChangeTest {

	@Test
	public void nullCoins() {
		new CoinChange().coinChangeFast(null, 0);
	}

	@Test
	public void emptyCoins() {
		new CoinChange().coinChangeFast(new int[] {}, 0);
	}

	@Test
	public void fNegative() {
		new CoinChange().coinChangeFast(new int[] { 1, 2, 5 }, -1);
	}

	@Test
	public void f0() {
		new CoinChange().coinChangeFast(new int[] { 1, 2, 5 }, 0);
	}

	@Test
	public void f1() {
		new CoinChange().coinChangeFast(new int[] { 1 }, 1);
	}

	@Test
	public void f11() {
		Assert.assertSame(3, new CoinChange().coinChangeFast(new int[] { 1, 2, 5 }, 11));
	}

//	@Test
//	public void f15() {
//		Assert.assertSame(3, new CoinChange().coinChange(new int[] { 1, 2, 5 }, 15));
//	}
//
//	@Test
//	public void f23() {
//		Assert.assertSame(6, new CoinChange().coinChange(new int[] { 1, 2, 5 }, 23));
//	}
//
//	@Test
//	public void f6249() {
//		Assert.assertSame(20, new CoinChange().coinChange(new int[] { 186, 419, 83, 408 }, 6249));
//	}

	@Test
	public void f_Extreme() {
		Assert.assertSame(2, new CoinChange().coinChangeFast(new int[] { 1, 2147483647 }, 2));
	}
}
