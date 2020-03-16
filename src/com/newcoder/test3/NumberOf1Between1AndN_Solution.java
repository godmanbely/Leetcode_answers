package com.newcoder.test3;

public class NumberOf1Between1AndN_Solution {
	public int numberOf1Between1AndN_Solution(int n) {
		int count = 0;
		while (n > 0) {
			String string = String.valueOf(n);
			char[] cr = string.toCharArray();
			for (int i = 0; i < cr.length; i++) {
				if (cr[i] == '1') {
					count++;
				}
			}
			n--;
		}
		
		return count;
	}
}
