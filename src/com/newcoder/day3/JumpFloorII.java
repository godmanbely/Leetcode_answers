package com.newcoder.day3;

public class JumpFloorII {
	public int jumpFloorII(int target) {
		if (target <= 0) {
			return 0;
		}
		if (target == 1) {
			return 1;
		}
		int f1 = 1;
		int f2 = 2;
		for (int i = 2; i <= target; i++) {
			f2 = f1 * 2;
			f1 = f2;
		}
		return f2;
	}

}
