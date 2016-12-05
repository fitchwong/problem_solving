# Sum Root To Leaf Numbers

<strong>Question</strong>

Given a binary tree containing digits from `0-9` only, each root-to-leaf path could represent a number.

An example is the root-to-leaf path `1->2->3` which represents the number `123`.

Find the total sum of all root-to-leaf numbers.

For example,

		1
	   / \
	  2   3
The root-to-leaf path `1->2` represents the number `12`.
The root-to-leaf path `1->3` represents the number `13`.

Return the sum = `12 + 13 = 25`.

<strong>Solution A</strong>

Populate the parent value to children. This will change the value of children.
If the modification is allowed, this is solution that can reuse the same function. 

[Analysis Summary - sumNumbersChangeTreeNode](https://github.com/RaysonYeungHK/problem_solving/tree/master/LeetCode/src/com/codepicker/exercise/sumroottoleafnumbers/test_results_change_treenode.jpg)

- Computation Complexity: O(n)

<strong>Solution B</strong>

Create another function with 1 more parameter to pass the value accumulated from parent.

[Analysis Summary - sumNumbersNormal](https://github.com/RaysonYeungHK/problem_solving/tree/master/LeetCode/src/com/codepicker/exercise/sumroottoleafnumbers/test_results_normal.jpg)

- Computation Complexity: O(n)
