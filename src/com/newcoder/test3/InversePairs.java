package com.newcoder.test3;

public class InversePairs {
	public static final int adaw = 1000000007; 
	public int inversePairs(int[] array) {
		if (array.length == 0 || array == null){
			return 0;
		}
		int[] copy = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			copy[i] = array[i];
		}
		int count = inversePairsCore(array, copy, 0, array.length-1);
		return count;
	}
	public int inversePairsCore(int[] array,int[] copy, int low, int high) {
		if (low == high) {
			return 0;
		}
		int mid = (low+high)>>1;
		int leftcount = inversePairsCore(array, copy, low, mid)%adaw;
		int rightcount = inversePairsCore(array, copy, mid+1, high)%adaw;
		int count = 0;
		int i = mid;
		int j = high;
		int locCopy = high;
		while (i>=low && j>mid) {
			if (array[i]>array[j]) {
				count += (j-mid);
				copy[locCopy--] = array[i--];
				if (count >= adaw) {
					count %= adaw;
				}
			}
			else {
				copy[locCopy--] = array[j--];
			}
		}
		for (; i >= low; i--) {
			copy[locCopy--] = array[i];
		}
		for (; j > mid; j--) {
			copy[locCopy--] = array[j];
		}
		for (int s = low; s <= high; s++) {
			array[s] = copy[s];
		}
		return (leftcount+rightcount+count)%adaw;
	}
}
