package com.leetcode.day1;

public class Mirror {
	public void mirror(Treenode root) {
		if (root == null) {
			return ;
		}
		Treenode temp = root.left;
		root.left = root.right;
		root.right = temp;
		mirror(root.left);
		mirror(root.right);
	}
}
