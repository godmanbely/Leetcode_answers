package com.leetcode.day1;

import java.util.PriorityQueue;

public class Minnumber {
	public int minnumberinrotearray(int[] array) {
		int n =array.length;
		if (n==0) {
			return 0;
		}
		PriorityQueue<Integer> pri = new PriorityQueue<Integer>();
		for (int i = 0; i < n; i++) {
			pri.add(array[i]);
		}
		return pri.poll();
	}


}
