package com.acwing.day1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Duplicateinarray {
	public int duplicateinarray(int[] nums) {
		int length = nums.length;
		if ((nums == null)|| length == 0 )
			return -1;
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < length; i++) {
			if (nums[i]<0 || nums[i]>length-1) {
				return -1;
			}
		}
		Arrays.sort(nums);
		for (int i = 0; i < length; i++) {
			if (!set.add(nums[i])) {
				return nums[i];
			}
		}
		return -1;
	}

}
