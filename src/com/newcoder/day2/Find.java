package com.newcoder.day2;

public class Find {
	public boolean find(int[][] array, int target) {
		int col = array[0].length - 1;
		int row = array.length - 1;
		int i = row;
		int j = 0;
		while (i >= 0 && j <= col) {
			if (target == array[i][j]) {
				return true;
			}else if (target > array[i][j]) {
				j++;
			}else if (target < array[i][j]) {
				i--;
			}
		}
		return false;
	}

}
