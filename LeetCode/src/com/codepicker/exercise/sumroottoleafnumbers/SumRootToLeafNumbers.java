package com.codepicker.exercise.sumroottoleafnumbers;

public class SumRootToLeafNumbers {

	public int sumNumbersNormal(TreeNode root) {
		return sumNumbersNormal(root, 0);
	}

	public int sumNumbersNormal(TreeNode root, int prefix) {
		if (root == null) {
			return 0;
		}

		if (root.left == null && root.right == null) {
			return root.val + prefix;
		}

		prefix += root.val;
		prefix *= 10;
		return sumNumbersNormal(root.left, prefix) + sumNumbersNormal(root.right, prefix);
	}

	public int sumNumbersChangeTreeNode(TreeNode root) {
		if (root == null) {
			return 0;
		}

		if (root.left == null && root.right == null) {
			return root.val;
		}

		int numberToPopulate = root.val * 10;

		if (root.left != null) {
			root.left.val += numberToPopulate;
		}

		if (root.right != null) {
			root.right.val += numberToPopulate;
		}

		return sumNumbersChangeTreeNode(root.left) + sumNumbersChangeTreeNode(root.right);
	}
}
