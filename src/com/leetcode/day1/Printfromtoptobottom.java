package com.leetcode.day1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Printfromtoptobottom {
	public ArrayList<Integer> Printtoptobottom(Treenode root) {
		ArrayList<Integer> result = new ArrayList<>();
		if (root == null) {
			return result;
		}
		Queue<Treenode> queue = new LinkedList<Treenode>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			Treenode temp = queue.poll();
			result.add(temp.val);
			if (temp.left!=null) {
				queue.offer(temp.left);
			}
			if (temp.right!=null) {
				queue.offer(temp.right);
			}
		}
		return result;
	}
	
	

}
