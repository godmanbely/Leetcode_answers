package com.newcoder.day2;

public class Fibonacci {
	public int fibonacci(int n) {
		int preNum = 1;
		int prePreNum = 0;
		int result = 0;
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		for (int i = 2; i <= n; i++) {
			result = preNum + prePreNum;
			prePreNum = preNum;
			preNum = result;
		}
		return result;
	}

}
