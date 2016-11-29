package com.codepicker.exercise.coinchange;

import java.util.Arrays;
import java.util.LinkedList;

import com.codepicker.lib.Logger;

public class CoinChange {
    public int coinChangeFast(int[] coins, int amount) {
        if (coins == null) {
            throw new IllegalArgumentException("coins cannot be null");
        }
        if (coins.length == 0) {
            throw new IllegalArgumentException("coins length cannot be 0");
        }
        if (amount < 1) {
            return 0;
        }
        if (coins.length == 1 && amount % coins[0] == 0) {
            return amount / coins[0];
        }
        // Sort the list of coins first, O(nlgn)
        Arrays.sort(coins);

        int[] calculatedCount = new int[amount + 1];

        // initialize
        int len = calculatedCount.length;

        calculatedCount[0] = 0; // To reach 0 no coins are required!
        for (int i = 1; i < len; i++) {
            calculatedCount[i] = Integer.MAX_VALUE - 1;
        }

        for (int j = 0; j < coins.length; j++) {
            for (int i = 0; i < len; i++) {
                if (i >= coins[j]) {
                    if (calculatedCount[i] > 1 + calculatedCount[i - coins[j]]) {
                        calculatedCount[i] = 1 + calculatedCount[i - coins[j]];
                    }
                }
            }
        }

        if (calculatedCount[amount] == Integer.MAX_VALUE - 1) {
            return -1;
        } else {
            return calculatedCount[amount];
        }
    }

    public int coinChangeSlow(int[] coins, int amount) {
        if (coins == null) {
            throw new IllegalArgumentException("coins cannot be null");
        }
        if (coins.length == 0) {
            throw new IllegalArgumentException("coins length cannot be 0");
        }
        if (amount < 1) {
            return 0;
        }
        if (coins.length == 1 && amount % coins[0] == 0) {
            return amount / coins[0];
        }
        // Sort the list of coins first, O(nlgn)
        Arrays.sort(coins);

        LinkedList<Integer> numberToBeProcess = new LinkedList<>();
        LinkedList<Integer> nextToBeProcess = new LinkedList<>();
        int[] foundNumber = new int[amount + 1];
        int endAt = coins.length - 1;

        for (int i = endAt; i >= 0; i--) {
            if (coins[i] == amount) {
                return 1;
            }
            if (coins[i] < amount) {
                numberToBeProcess.add(coins[i]);
                foundNumber[coins[i]] = 1;
            } else {
                endAt = i - 1;
            }
        }

        int numberOfPass = 1;

        while (!numberToBeProcess.isEmpty()) {
            numberOfPass++;
            while (!numberToBeProcess.isEmpty()) {
                int currentNumber = numberToBeProcess.poll();
                for (int i = endAt; i >= 0; i--) {
                    if (coins[i] < amount) {
                        int nextNumber = currentNumber + coins[i];
                        if (nextNumber == amount) {
                            return numberOfPass;
                        } else if (nextNumber < amount) {
                            if (foundNumber[nextNumber] == 0) {
                                foundNumber[nextNumber] = numberOfPass;
                                nextToBeProcess.add(nextNumber);
                            }
                        }
                    }
                }
            }
            LinkedList<Integer> tmp = numberToBeProcess;
            numberToBeProcess = nextToBeProcess;
            nextToBeProcess = tmp;
        }
        return -1;
    }
}
