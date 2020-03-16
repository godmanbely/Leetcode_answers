package com.newcoder.test3;

public class FindGreatestSumOfSubArray {
	public int findGreatestSumOfSubArray(int[] array) {
		int result = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
				result += array[i];
				if (result> max) {
					max = result;
				}
			if (result < 0 ) {
				
				result = 0;
			}
		}
		return max;
	}
}
