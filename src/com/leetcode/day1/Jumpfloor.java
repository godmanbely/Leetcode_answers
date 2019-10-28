package com.leetcode.day1;

import java.util.Arrays;

public class Jumpfloor {
	public int jumpfloor(int floor) {
		if (floor<=2) {
			return floor;
		}
		int pre2=1,pre1=2;
		for (int i = 3; i <= floor; i++) {
			int cur = pre2 + pre1;
			pre2=pre1;
			pre1=cur;
		}
		return pre1;
		
	}
	public int jumpfloorii(int floor) {
		if (floor<=2) {
			return floor;
		}
		int []dp = new int[floor+1];
		Arrays.fill(dp, 1);
		for (int i = 2; i <= floor; i++) {
			for (int j = i-1; j >= 0; j--) {
				dp[i] += dp[j];
			}
		}
		return dp[floor];
	}

}
