package com.leetcode.day1;

public class Rectcover {
	public int rectcover(int target) {
		if (target<=2) {
			return target;
		}
		
		int pre1=2;
		int pre2=1;
		for (int i = 3; i <= target; i++) {
			int cur = pre2 + pre1;
			pre2=pre1;
			pre1=cur;
		}
		return pre1;
	}

}
