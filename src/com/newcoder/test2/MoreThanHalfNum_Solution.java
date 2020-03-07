package com.newcoder.test2;

import java.util.Arrays;


public class MoreThanHalfNum_Solution {
	public int moreThanHalfNum_Solution(int[] array) {
		int count = 0;
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			if (array[i] == array[(array.length/2)+1]) {
				count ++;
			}
		}
		if (count > array.length/2+1) {
			return array[(array.length/2)+1];
		}else {
			return 0;
		}
		
	}
}
