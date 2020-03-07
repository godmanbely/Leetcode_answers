package com.newcoder.test1;

import java.util.ArrayList;

import com.leetcode.day3.TreeNode;

public class FindPath {
	   ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
	   ArrayList<Integer> arrayList = new ArrayList<>();
	public ArrayList<ArrayList<Integer>> findPath(TreeNode root, int target) {
		if (root == null) {
			return arr;
		}
		
		arrayList.add(root.val);
		target -= root.val;
		if (target == 0 && root.left == null && root.right == null) {
			arr.add(new ArrayList<Integer>(arrayList));
		}
		findPath(root.left, target);
		findPath(root.right, target);
		arrayList.remove(arrayList.size() - 1);//深度遍历需要回退
		return arr;
	}
}
