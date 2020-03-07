package com.newcoder.test2;

import java.util.Stack;

import com.leetcode.day3.TreeNode;

public class Convert {
	public TreeNode convert(TreeNode pRootOfTree) {
		if (pRootOfTree == null) {
			return null;
		}
		Stack<TreeNode> stack = new Stack<>();
		TreeNode p = pRootOfTree;
		TreeNode pre = null;
		boolean isFirst = true;
		while (p != null || !stack.isEmpty()) {
			while (p != null) {
				stack.push(p);
				p = p.left;
			}
			p = stack.pop();
			if (isFirst) {
				pRootOfTree = p;
				pre = pRootOfTree;
				isFirst = false;
			}else {
				pre.right=p;
				p.left = pre;
				pre = p;
			}
			p = p.right;
		}
		return pRootOfTree;
		
		
	}

}
