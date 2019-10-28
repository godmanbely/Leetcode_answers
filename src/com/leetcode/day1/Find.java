package com.leetcode.day1;

public class Find {
	public static boolean find(int targe,int [][]array) {
		int rows = array.length;
		if (rows == 0) {
			return false;
		}
		int cols = array[0].length;
		if (cols==0) {
			return false;
		}
		int row = rows-1;
		int col = 0;
		while (row>=0&&col<cols) {
			if (array[row][col]<targe) {
				col++;
			}else if (array[row][col]>targe) {
				row--;
			}else {
				return true;
			}
		}
		return false;
	}

}
