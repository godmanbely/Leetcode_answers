package com.leetcode.day4;

public class Flatten {
	public void flatten(TreeNode root) {
		if (root.left == null) {
			root = root.right;
		}else {
			TreeNode pre = root.left;
			while (pre.right != null) {
				pre = pre.right;
			}
			pre.right = root.right;
			root.right = root.left;
			root.left = null;
			root = root.right;
		}
	}

}
