package com.newcoder.day4;

import com.leetcode.day3.TreeNode;

public class Mirror {
	public void mirror(TreeNode root) {
		if (root == null) {
			return;
		}
		if(root.left == null && root.right == null)
            return;
		if (root != null) {
			TreeNode temp = root.left;
			root.left = root.right;
			root.right = temp;
			if(root.left != null)
				mirror(root.left);
			if(root.right != null)
				mirror(root.right);
		}
		
	}

}
