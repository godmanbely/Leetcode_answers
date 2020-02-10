package com.leetcode.homework_day1;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		int[] res = new int[2];
		if (nums == null || nums.length <= 1) {
			return res;
		}
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer> ();
		for (int i = 0; i < nums.length; i++) {
			int num = nums[i];
			int val = target - num;
			if (map.containsKey(val)) {
				res[0] = i;
				res[1] = map.get(val);
				return res;
			}else {
				map.put(val, i);
			}
		}
		return res;
	}


}
