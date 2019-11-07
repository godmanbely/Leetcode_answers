package com.leetcode.day3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NumTrees {
	List<List<Integer>> levels = new ArrayList<List<Integer>>();
	public List<List<Integer>> levelOrder(TreeNode root) {
		if (root == null) {
			return levels;
		}
		helper(root, 0);
		return levels;
	}
	public void helper(TreeNode node, int level) {
		if (levels.size() == level) {
			levels.add(new ArrayList<Integer>());
		}
		levels.get(level).add(node.val);
		if (node.left != null) {
			helper(node.left, level + 1);
		}
		if (node.right != null) {
			helper(node.right, level + 1);
		}
	}
	
	
	
	public List<List<Integer>> levelOrder_two(TreeNode root) {
		List<List<Integer>> levels = new ArrayList<List<Integer>>();
		if (root == null) {
			return levels;
		}
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		int level = 0;
		while ( !queue.isEmpty() ) {
			levels.add(new ArrayList<Integer>());
			int level_length = queue.size();
			for (int i = 0; i < level_length; ++i) {
				TreeNode node = queue.remove();
				levels.get(level).add(node.val);
				if (node.left != null) {
					queue.add(node.left);
				}
				if (node.right != null) {
					queue.add(node.right);
				}
			}
			
			level++;
		}
		
		return levels;
	}

}
