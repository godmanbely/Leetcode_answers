package com.newcoder.day2;

public class MinNumberInRotateArray {
	public int minNumberInRotateArray(int[] array) {
		if (array == null) {
			return 0;
		}
		int i = 0;
		for (; i < array.length; i++) {
			if (array[i] > array[i+1]) {
				break;
			}
		}
		return array[i+1];
	}

}
