package com.newcoder.test1;

import java.util.ArrayList;

import com.leetcode.day3.TreeNode;

public class PrintFromTopToBottom {
	public ArrayList<Integer> printFromTopToBottom(TreeNode root) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		ArrayList<TreeNode> queue = new ArrayList<>();
		if (root == null) {
			return arrayList;
		}
		queue.add(root);
		while (queue.size() != 0) {
			TreeNode temp = queue.remove(0);
			if (temp.left != null) {
				queue.add(temp.left);
			}
			if (temp.right != null) {
				queue.add(temp.right);
			}
			arrayList.add(temp.val);
		}
		return arrayList;
	}

}
