# Probability to Goal

<strong>Question</strong>

There is a game board with “n” spaces from the starting point to end point.

You are going to roll a 6-faced dice and move forward the same number of spaces that you rolled.

Please implement a program that calculates how many possible ways are there to arrive exactly at the finishing point.

<strong>Solution</strong>

Assume N = 1, there is only 1 way to reach the end point.

`f(1) = 1`

Assume N = 2, there are 2 ways to reach the end point.

1. Roll 1 + 1
2. Roll 2

`f(2) = 2`

And so on,

Assume N = 3

`f(3) = 5`

Assume N = 4

`f(4) = 8`

Assume N = 5

`f(5) = 14`

Assume N = 6

`f(6) = 25`

When N > 6, the function is updated as generic function.

For example,

Assume N = 7

In the first roll, we may roll 1 ~ 6, then remaining roll will be 7 - [1~6].

Therefore, the generic function is

`f(N) = f(N-1) + f(N-2) + f(N-3) + f(N-4) + f(N-5) + f(N-6) where N > 6`