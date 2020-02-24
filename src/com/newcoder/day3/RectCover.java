package com.newcoder.day3;

public class RectCover {
	public int rectCover(int target) {
		if (target < 1) {
			return 0;
		} else if (target <= 2) {
			return target;
		}
//		else {
//			return rectCover(target-1) + rectCover(target - 2);
//		}
		int f1 = 1;
		int f2 = 2;
		int result = 0;
		for (int i = 3; i <= target; i++) {
			result = f2 + f1;
			f1 = f2;
			f2 = result;
		}
		return result;
	}

}
