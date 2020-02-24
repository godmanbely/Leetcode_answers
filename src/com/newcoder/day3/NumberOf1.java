package com.newcoder.day3;

public class NumberOf1 {
	public int numberOf1(int n) {
		int count = 0;
		int flag = 1;
		while (flag != 0) {
			if (((n & flag) != 0)) {
				count++;
			}
			flag = flag << 1;
		}
		return count;
	}

}
