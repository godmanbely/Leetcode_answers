package com.leetcode.day6;

import java.util.Stack;

public class IsVaildBST {
	public boolean isvaildBST(Treenode root) {
		double last = - Double.MAX_VALUE;
		if (root == null) {
			return true;
		}
		if (isvaildBST(root.left)) {
			if (last < root.val) {
				last = root.val;
				return isvaildBST(root.right);
			}
		}
		return false;
	}
	
	public boolean isvaildBST_2(Treenode root) {
		Stack<Treenode> stack = new Stack<>();
		double inorder = -Double.MAX_VALUE;
		
		while (!stack.isEmpty() || root != null) {
			while (root != null) {
				stack.push(root);
				root = root.left;
			}
			root = stack.pop();
			
			if (root.val <= inorder) {
				return false;
			}
			inorder = root.val;
			root = root.right;
		}
		return true;
	}
}


class Treenode{
	int val;
	Treenode left;
	Treenode right;
	public Treenode(int x) {
		val = x;
	}
}