package com.newcoder.day3;

public class JumpFloor {
	public int jumpFloor(int number) {
		if (number < 2) {
			return number;
		}
		int f1 = 1;
		int f2 = 2;
		int target = 0;
		for (int i = 2; i <= number; i++) {
			target = f2 + f1;
			f1 = f2;
			f2 = target;
		}
		return target;
	}

}
