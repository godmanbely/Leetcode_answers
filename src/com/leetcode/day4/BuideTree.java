package com.leetcode.day4;

import java.util.HashMap;

public class BuideTree {
	int pre_idx = 0;
	int[] preorder;
	int[] inorder;
	HashMap<Integer, Integer> idx_map = new HashMap<>();
	public TreeNode helper(int in_left, int in_right) {
		if (in_left == in_right) {
			return null;
		}
		int root_val = preorder[pre_idx];
		TreeNode root = new TreeNode(root_val);
		int index = idx_map.get(root_val);
		pre_idx++;
		root.left = helper(in_left, index);
		root.right = helper(index + 1, in_right);
		return root;
	}
	public TreeNode BuildTree(int[] preorder, int[] inorder) {
		this.inorder = inorder;
		this.preorder = preorder;
		int idx = 0;
		for(Integer val : inorder) {
			idx_map.put(val, idx++);
		}
		return helper(0, inorder.length);
	}

}
