package com.newcoder.day3;

public class ReOrderArray {
	public void reOrderArray(int[] array) {
		if (array == null || array.length == 0) {
			return; 
		}
		int i = 0, j;
		while (i < array.length) {
			while (i<array.length && !isEven(array[i])) {
				i++;
			}
			j = i + 1;
			while (j < array.length && isEven(array[j])) {
				j++;
			}
			if (j < array.length) {
				int temp = array[j];
				for (int t = j-1; t > i; t--) {
					array[t+1] = array[t];
				}
				array[i++] = temp;
			}else {
				break;
			}
		}
	}
	
	public boolean isEven(int n) {
		if (n % 2 == 0) {
			return true;
		}
		return false;
	}

}
