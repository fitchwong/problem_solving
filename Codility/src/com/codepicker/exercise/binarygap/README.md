# BinaryGap
Find longest sequence of zeros in binary representation of an integer.

Question
-
A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.

For example:

1. The number 9 has binary representation 1001 and contains a binary gap of length 2.

2. The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3.

3. The number 20 has binary representation 10100 and contains one binary gap of length 1.

4. The number 15 has binary representation 1111 and has no binary gaps.

For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5.

Testing Result
-
[Analysis Summary](https://github.com/RaysonYeungHK/problem_solving/tree/master/Codility/src/com/codepicker/exercise/binarygap/test_results.jpg)