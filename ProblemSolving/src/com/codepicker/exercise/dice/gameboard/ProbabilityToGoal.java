package com.codepicker.exercise.dice.gameboard;

import java.math.BigInteger;
import java.util.LinkedList;

import com.codepicker.lib.Logger;

/**
 * Question:
 * There is a game board with n blocks, the player move forward as same as the number of the 6-faced dice rolled.
 * Find out the possible way for a player from start point to the end of game board.
 * 
 * Answer:
 * f(1) = 1 // when total number of block is 1, there is 1 way to reach the goal
 * f(2) = 2 // when total number of block is 2, there is 2 ways to reach the goal, such as 1+1 and 2
 * f(3) = 5 // when total number of block is 3, there is 5 ways to reach the goal
 * f(4) = 8 // when total number of block is 3, there is 5 ways to reach the goal
 * f(5) = 14 // when total number of block is 3, there is 5 ways to reach the goal
 * f(6) = 25 // when total number of block is 3, there is 5 ways to reach the goal
 * 
 * // when total number of block is 7, you may rolled 1~6 at 1st time
 * // then you have 7-1 ~ 7-6 block for the rest, thus 
 * f(7) = f(7-1) + f(7-2) + f(7-3) + f(7-4) + f(7-5) + f(7-6) 
 * 
 * // With MI, when total number of block is n, then
 * f(n) = f(n-1) + f(n-2) + f(n-3) + f(n-4) + f(n-5) + f(n-6)
 * 
 *         6
 * f(n) =  ∑ f(n-k)
 *        k=1 
 * @author Rayson Yeung
 */
public class ProbabilityToGoal {
    
    private static final BigInteger[] PRE_CALCULATED_PROBABILITY = {
            BigInteger.valueOf(1)
            ,BigInteger.valueOf(2)
            ,BigInteger.valueOf(5)
            ,BigInteger.valueOf(8)
            ,BigInteger.valueOf(14)
            ,BigInteger.valueOf(25)
    };
    
    public BigInteger calculateRecursive(BigInteger number){
        if (number.compareTo(BigInteger.valueOf(0)) <= 0) {
            throw new IllegalArgumentException("number cannot be smaller than 1, found " + number);
        }

        if (number.compareTo(BigInteger.valueOf(6)) <= 0) {
            return PRE_CALCULATED_PROBABILITY[number.intValue()-1];
        }
        
        return calculateRecursive(number.subtract(BigInteger.valueOf(1)))
                .add(calculateRecursive(number.subtract(BigInteger.valueOf(2))))
                .add(calculateRecursive(number.subtract(BigInteger.valueOf(3))))
                .add(calculateRecursive(number.subtract(BigInteger.valueOf(4))))
                .add(calculateRecursive(number.subtract(BigInteger.valueOf(5))))
                .add(calculateRecursive(number.subtract(BigInteger.valueOf(6))));
    }
    
    public BigInteger calculateLoop(BigInteger number){
        if (number.compareTo(BigInteger.valueOf(0)) <= 0) {
            throw new IllegalArgumentException("number cannot be smaller than 1, found " + number);
        }

        if (number.compareTo(BigInteger.valueOf(6)) <= 0) {
            return PRE_CALCULATED_PROBABILITY[number.intValue()-1];
        }
        
        LinkedList<BigInteger> previousResult = new LinkedList<>();
        for( BigInteger probability :PRE_CALCULATED_PROBABILITY ){
            previousResult.add(probability);
        }
        
        for (BigInteger i = BigInteger.valueOf(7); i.compareTo(number) <= 0; i = i.add(BigInteger.valueOf(1))) {
            BigInteger current = BigInteger.ZERO;
            for (BigInteger reference : previousResult) {
                current = current.add(reference);
            }
            previousResult.poll();
            previousResult.add(current);
        }
        return previousResult.getLast();
    }
}
