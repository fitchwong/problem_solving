# Repeated DNA Sequences

<strong>Question</strong>

All DNA is composed of a series of nucleotides abbreviated as A, C, G, and T, for example: "ACGAATTCCG". When studying DNA, it is sometimes useful to identify repeated sequences within the DNA.

Write a function to find all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule.

<strong>Example:</strong>

`Given s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT",`

`Return:`
`["AAAAACCCCC", "CCCCCAAAAA"].`

<strong>Solution A</strong>

Simply use a HashSet to store what was found.

<strong>Testing Result</strong>

[Analysis Summary - findRepeatedDnaSequencesSlow](https://github.com/RaysonYeungHK/problem_solving/tree/master/LeetCode/src/com/codepicker/exercise/repeateddnasequence/test_results_slow.jpg)

- Computation Complexity: O(n)
- Space Complexity: O(n)

<strong>Solution B</strong>

There are 'A','C','G','T' in DNA.

For 10 continuous letters, there is 4^10 = 1048576 combination of the ACGT.

Assume

`A = A - A = 0 = 0x00`
`C = C - A = 1 = 0x01`
`G = G - A = 6 = 0x10`
`T = T - A = 19 = 0x11`

`ACGT will be 0x00011011 = 27`

With using Integer rather than String, we can use int[] rather than HashSet to improve the performance

[Analysis Summary - findRepeatedDnaSequencesFast](https://github.com/RaysonYeungHK/problem_solving/tree/master/LeetCode/src/com/codepicker/exercise/repeateddnasequence/test_results_fast.jpg)

- Computation Complexity: O(n)
- Space Complexity: O(n)
- P.S. using int[] instead of HashMap to reduce to accessing time
