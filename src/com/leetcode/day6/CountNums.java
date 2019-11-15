package com.leetcode.day6;

import java.util.HashMap;
import java.util.Map;

public class CountNums {
	public Map<Integer, Integer> countNums(int[] nums) {
		Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
		for(int num : nums) {
			if (!counts.containsKey(num)) {
				counts.put(num, 1);
			}else {
				counts.put(num, counts.get(num) + 1);
			}
		}
		return counts;
	}
	public int majorityEelement(int[] nums) {
		Map<Integer, Integer> counts = countNums(nums);
		Map.Entry<Integer, Integer> majorityEntry = null;
		for(Map.Entry<Integer, Integer> entry : counts.entrySet()) {
			if (majorityEntry == null || entry.getValue() > majorityEntry.getValue()) {
				majorityEntry = entry;
			}
		}
		return majorityEntry.getKey();
	}
}
