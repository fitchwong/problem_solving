# Coin Change

<strong>Question</strong>

You are given coins of different denominations and a total amount of money amount. Write a function to compute the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.

<strong>Example 1:</strong>

`coins = [1, 2, 5], amount = 11`

`return 3 (11 = 5 + 5 + 1)`

<strong>Example 2:</strong>

`coins = [2], amount = 3`

`return -1.`

<strong>Note:</strong>

You may assume that you have an infinite number of each kind of coin.

<strong>Testing Result</strong>

[Analysis Summary - coinChangeSlow](https://github.com/RaysonYeungHK/problem_solving/tree/master/LeetCode/src/com/codepicker/exercise/coinchange/test_results_slow.jpg)

- Computation Complexity: O(kn)
- Space Complexity: O(lgn)
- P.S. LinkedList is slower, however, this implementation should use less memory in runtime  

[Analysis Summary - coinChangeFast](https://github.com/RaysonYeungHK/problem_solving/tree/master/LeetCode/src/com/codepicker/exercise/coinchange/test_results_fast.jpg)

- Computation Complexity: O(kn)
- Space Complexity: O(n)
