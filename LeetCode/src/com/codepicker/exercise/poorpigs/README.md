# Poor Pigs

<strong>Question</strong>

There are 1000 buckets, one and only one of them contains poison, the rest are filled with water. They all look the same. If a pig drinks that poison it will die within 15 minutes. What is the minimum amount of pigs you need to figure out which bucket contains the poison within one hour.

Answer this question, and write an algorithm for the follow-up general case.

<strong>Solution</strong>

There are 4 factors in the question `pig required` `bucket` `minute to die after pig drunk poison` `minute for total test`

First we reverse the question to:

How many bucket we can test with

	1 pig
	15 minutes to die
	60 minutes for total test

Let's solve it with graph, if there is only 1 pig, we can test total 5 buckets.
Assume A,B,C,D are safe, then we know E is poison.

	Graph 1
	|-------|--------|
	| Time  | Bucket |
	|-------|--------|
	| 00~15 | A      |
	| 16~30 | B      |
	| 31~45 | C      |
	| 46~60 | D      |
	| 60+   | E      |
	|-------|--------|
	
Then we have

	let number of bucket can be tested with 1 pig = f(testToDie as D, totalTestTime as T)
	f(D,T) = floor(T/D)+1;

If we change `bucket` to `set of bucket` in the graph 1, then we can assume 1 pig can test 5 set of buckets with

	15 minutes to die
	60 minutes for total test

	Graph 2
	|-------|---------------|
	| Time  | Set of Bucket |
	|-------|---------------|
	| 00~15 | A             |
	| 16~30 | B             |
	| 31~45 | C             |
	| 46~60 | D             |
	| 60+   | E             |
	|-------|---------------|

Next question is, how many bucket we can test with
	
	2 pigs
	15 minutes to die
	60 minutes for total test
	
Let's solve it with graph, each pig can test 5 set of buckets, then we may assume total should be 5*2 = 10 set of buckets can be tested with 2 pigs.

	Graph 3
	|------------|-------|-------|-------|-------|-----|------------|
	| Time       | 00~15 | 16~30 | 31~45 | 46~60 | 60+ | Pig B Test |
	|------------|-------|-------|-------|-------|-----|------------|
	| 00~15      | B1    | B2    | B3    | B4    | B5  | A          |
	| 16~30      | B6    | B7    | B8    | B9    | B10 | B          |
	| 31~45      | B11   | B12   | B13   | B14   | B15 | C          |
	| 46~60      | B16   | B17   | B18   | B19   | B20 | D          |
	| 60+        | B21   | B22   | B23   | B24   | B25 | E          |
	|------------|-------|-------|-------|-------|-----|------------|
	| Pig A test | F     | G     | H     | I     | J   |            |
	|------------|-------|-------|-------|-------|-----|------------|

In the graph, we assume `A` is mix of `B1, B2, B3, B4, B5`, `F` is mix of `B1, B6, B11, B16, B21` and so on.

1. Assume Pig A and Pig B try all buckets and `never die`. It means `A, B, C, D, F, G, H, I, J` are safe. Only `B25` is excluded. Then `B25` is poison.
2. Assume Pig A try all buckets and `never die`, Pig B die between `31~45` minute. It means `A, B, F, G, H, I` are safe. `C` and `J` must be poison. Only `B15` is included in `C` and `J`, then `B15` is poison.
3. Assume Pig A die between `16~30` minute, Pig B die between `31~45` minute. It means `C` and `G` must be poison. Only `B12` is included in `C` and `G`, then `B12` is poison.

Now, we need to find out the formula that we need.

From previous example, we already have

	let number of bucket can be tested with 1 pig = f(testToDie as D, totalTestTime as T)
	f(D,T) = floor(T/D)+1;
	
Now we have, let number of bucket can be tested with N pig = f(P)

	f(1) = 5
	f(2) = 25
	
then we assume

	f(P) = 5^P;

Since 5 is calculated from `f(D,T)`, we do a substitution.

	f(1) = f(D,T)^1
	f(2) = f(D,T)^2 
	f(P) = f(D,T)^P
	
then finally we have
	
	f(P,D,T) = (floor(T/D)+1)^P
	
That's not too difficult, right? Sure, you need to test it!!
	
[Analysis Summary](https://github.com/RaysonYeungHK/problem_solving/tree/master/LeetCode/src/com/codepicker/exercise/poorpig/test_results.jpg)