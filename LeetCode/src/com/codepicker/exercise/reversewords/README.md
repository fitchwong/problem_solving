# Reverse Word in a String

<strong>Question</strong>

Given an input string, reverse the string word by word.

For example,

	Given s = "the sky is blue",
	return "blue is sky the".

<strong>Clarification:</strong>

What constitutes a word?

A sequence of non-space characters constitutes a word.

Could the input string contain leading or trailing spaces?

Yes. However, your reversed string should not contain leading or trailing spaces.

How about multiple spaces between two words?

Reduce them to a single space in the reversed string.

<strong>Solution A</strong>

Convert a string to char and directly modify the char array.

Input: ` I am a man `

1. Trim start and end spaces `I  am  a  man`
2. Reverse word 1 by 1, and trim multiple space to single space `I ma a nam`
3. Reverse the whole sentence `man a am I`

[Analysis Summary - reverseWordsFast](https://github.com/RaysonYeungHK/problem_solving/tree/master/LeetCode/src/com/codepicker/exercise/reversewords/test_results_fast.jpg)

<strong>Solution B</strong>

1. Search the word from end of sentence
2. Append words to result one by one.

[Analysis Summary - reverseWordsSlow](https://github.com/RaysonYeungHK/problem_solving/tree/master/LeetCode/src/com/codepicker/exercise/reversewords/test_results_slow.jpg)
